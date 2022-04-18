package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.mapper.RelUserRoleMapper;
import com.ruoxu.xiaomaoran.mapper.UserMapper;
import com.ruoxu.xiaomaoran.dto.SignUpDto;
import com.ruoxu.xiaomaoran.model.RelUserRole;
import com.ruoxu.xiaomaoran.model.User;
import com.ruoxu.xiaomaoran.common.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.ruoxu.xiaomaoran.mapper.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class AuthService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RelUserRoleMapper relUserRoleMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean existsByUsername(String username) {
        List<User> userList = userMapper.select(c ->
                c.where(user.username, isEqualTo(username)));
        if (userList != null || userList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean existsByEmail(String email) {
        List<User> userList = userMapper.select(c ->
                c.where(user.email, isEqualTo(email)));
        if (userList != null || userList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Transactional
    public void insertByDto (SignUpDto signUpDto) {
        User user = new User();
        user.setUuid(UUIDGenerator.getUUID());
        user.setUsername(signUpDto.getUsername());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        userMapper.insert(user);

        RelUserRole relUserRole = new RelUserRole();
        relUserRole.setUserId(user.getId());
        relUserRole.setRoleId(1L);
        relUserRoleMapper.insert(relUserRole);
    }
}
