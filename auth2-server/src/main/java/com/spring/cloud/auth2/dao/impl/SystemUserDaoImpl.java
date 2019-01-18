package com.spring.cloud.auth2.dao.impl;


import com.spring.cloud.auth2.dao.SystemUserDao;
import com.spring.cloud.auth2.model.SystemUser;

public class SystemUserDaoImpl extends DaoImpl implements SystemUserDao {

    @Override
    public SystemUser readByName(String userName) {

//        CriteriaBuilder builder = currentSession().getCriteriaBuilder();
//
//        CriteriaQuery<SystemUser> criteria = builder.createQuery(SystemUser.class);
//
//        criteria.from(SystemUser.class);
//
//        currentSession().createCriteria(SystemUser.class, "w");

        return null;// TODO (lusudong, 2019/1/10)
    }
}
