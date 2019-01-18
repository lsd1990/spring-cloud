package com.spring.cloud.auth2.model;

import java.io.Serializable;

public class SystemUserRole implements Serializable{


    private static final long serialVersionUID = 4005146187411245962L;
    private Integer userId;
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
