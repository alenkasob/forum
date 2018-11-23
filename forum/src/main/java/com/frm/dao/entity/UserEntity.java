package com.frm.dao.entity;

import com.frm.utils.enums.UserType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "frm_users")
public class UserEntity implements Serializable {

    @Id
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserType role;

    public String getId() {
        return id;
    }

    public UserEntity setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPass() {
        return pass;
    }

    public UserEntity setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public UserType getRole() {
        return role;
    }

    public UserEntity setRole(UserType role) {
        this.role = role;
        return this;
    }
}