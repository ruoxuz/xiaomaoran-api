package com.ruoxu.xiaomaoran.dto;

/**
 * @author ruoxu
 */
public class UserDto {
    private String username;

    private String authData;

    public UserDto(String username, String authData) {
        this.username = username;
        this.authData = authData;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAuthData() {
        return authData;
    }

    public void setAuthData(String authData) {
        this.authData = authData;
    }
}
