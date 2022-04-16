package com.ruoxu.xiaomaoran.controller;

import com.ruoxu.xiaomaoran.config.JwtProvider;
import com.ruoxu.xiaomaoran.dto.UserDto;
import com.ruoxu.xiaomaoran.dto.LoginDto;
import com.ruoxu.xiaomaoran.dto.SignUpDto;
import com.ruoxu.xiaomaoran.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruoxu
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    /**
     * 登录
     * @param loginDto
     * @return
     * @throws Exception
     */
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LoginDto loginDto) throws Exception {
        String jwt = "";
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword())
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);

            jwt = jwtProvider.generateJwtToken(authentication);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok(new UserDto(loginDto.getUsername(), jwt));
    }

    /**
     * 注册
     * @param signUpDto
     * @return
     */
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpDto signUpDto) {
        if (authService.existsByUsername(signUpDto.getUsername())) {
            return new ResponseEntity<>("用户名已存在", HttpStatus.BAD_REQUEST);
        }
        if (authService.existsByEmail(signUpDto.getEmail())) {
            return new ResponseEntity<>("Email已存在", HttpStatus.BAD_REQUEST);
        }

        authService.insertByDto(signUpDto);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
    }
}
