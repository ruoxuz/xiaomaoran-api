package com.ruoxu.nekonekoko.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ruoxu
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuid;

    private String name;

    private String email;

    private String password;

    private String avatar;

    private String background;

    private Boolean del_flag;

    private Date createTime;

    private Date updateTime;
}
