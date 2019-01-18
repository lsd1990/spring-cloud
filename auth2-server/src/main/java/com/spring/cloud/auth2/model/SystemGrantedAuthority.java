package com.spring.cloud.auth2.model;

import org.springframework.security.core.GrantedAuthority;

public class SystemGrantedAuthority implements GrantedAuthority {

    private String authority;

    @Override
    public String getAuthority() {
        return this.authority ;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
