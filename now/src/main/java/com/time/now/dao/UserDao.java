package com.time.now.dao;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.time.now.entity.UserEntity;

public interface UserDao {
    UserEntity inserUser(UserEntity user);

    List<UserEntity> fetcUserList();

    public UserDetails fetchUserByUsername(String userName);
}
