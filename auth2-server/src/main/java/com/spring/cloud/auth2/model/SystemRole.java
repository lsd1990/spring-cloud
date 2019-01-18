package com.spring.cloud.auth2.model;

import java.io.Serializable;
import java.util.List;

public class SystemRole implements Serializable {


    private static final long serialVersionUID = -3600293586410796657L;
    private Integer id;
    private String name;
    private List<String> authorities;//权限

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }
}
