package com.spring.cloud.auth2.dao;


import com.spring.cloud.auth2.model.SystemUser;

public interface SystemUserDao {

    SystemUser readByName(String userName);
}
