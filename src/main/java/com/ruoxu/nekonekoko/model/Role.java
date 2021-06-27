package com.ruoxu.nekonekoko.model;

import javax.persistence.*;

/**
 * @author ruoxu
 */
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long userId;
}
