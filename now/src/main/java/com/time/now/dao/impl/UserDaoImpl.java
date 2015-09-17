package com.time.now.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.time.now.dao.UserDao;
import com.time.now.entity.UserEntity;
import com.time.now.entity.user.GrantedAuthorityImpl;

@Repository
public class UserDaoImpl
    implements UserDao
{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public UserDetails fetchUserByUsername(String userName) {
        boolean enabled = true;
        boolean accNotexpired = true;
        boolean credentialNoExpired = true;
        boolean accNotlocked = true;

        List<GrantedAuthority> authorityList = new ArrayList<GrantedAuthority>();
        authorityList.add(new GrantedAuthorityImpl());

        UserDetails user = new User(userName, "password", enabled, accNotexpired, credentialNoExpired, accNotlocked,
                authorityList);
        return user;
    }

    @Override
    public UserEntity inserUser(UserEntity user) {
        user = (UserEntity)this.sessionFactory.getCurrentSession().save(user);
        return user;
    }

    @Override
    public List<UserEntity> fetcUserList() {
        @SuppressWarnings("unchecked")
        List<UserEntity> userList = this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
        return userList;
    }
}
