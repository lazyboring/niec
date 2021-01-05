package com.ywy.niec.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author niechen
 * @since 2021-01-05 16:48:24
 */
public class User implements Serializable {
    private static final long serialVersionUID = -49066718123694056L;
    
    private Long id;
    
    private String username;
    
    private String password;
    
    private Integer age;
    
    private String perms;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

}