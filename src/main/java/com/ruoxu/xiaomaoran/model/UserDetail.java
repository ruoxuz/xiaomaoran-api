package com.ruoxu.xiaomaoran.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDetail {
    private Long id;

    private String uuid;

    private String email;

    private String password;

    private String username;

    private String avatar;

    private String background;

    private Date createTime;

    private Date updateTime;

    private List<Role> roles;
}
