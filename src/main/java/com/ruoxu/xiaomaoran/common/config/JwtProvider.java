package com.ruoxu.xiaomaoran.common.config;

import com.ruoxu.xiaomaoran.service.impl.UserPrinciple;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ruoxu
 */
@Component
public class JwtProvider {

    @Value("${jwt.Secret}")
    private String jwtSecret;

    @Value("${jwt.Expiration}")
    private int jwtExpiration;

    /**
     * 生成Token
     * @param authentication authentication
     * @return token
     */
    public String generateJwtToken(Authentication authentication) {
        UserPrinciple userPrinciple = (UserPrinciple) authentication.getPrincipal();
        return Jwts.builder()
                .setSubject(userPrinciple.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiration*1000))
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    /**
     * 验证Token是否有效
     * @param authToken token
     * @return true or false
     */
    public boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            System.out.println("Invalid JWT signature" + e);
        } catch (MalformedJwtException e) {
            System.out.println("Invalid JWT token" + e);
        } catch (ExpiredJwtException e) {
            System.out.println("Expired JWT token" + e);
        } catch (UnsupportedJwtException e) {
            System.out.println("Unsupported JWT token" + e);
        } catch (IllegalArgumentException e) {
            System.out.println("JWT claims string is empty" + e);
        }
        return false;
    }

    /**
     * 从Token获取用户名
     * @param token token
     * @return username
     */
    public String getUsernameFromJwtToken(String token) {
        return Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
