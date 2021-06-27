package com.ruoxu.nekonekoko.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ruoxu
 */
@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Boolean delFlag;

    private Date createTime;

    private Date updateTime;
}
