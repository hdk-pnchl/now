package com.time.now.service.impl;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.time.now.dao.UserDao;
import com.time.now.service.UserService;

@Service
public class UserServiceImpl
    implements UserService, UserDetailsService
{
    private UserDao userDao;

    @Override
    public User fetchLogedinUser() {
        User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String userName)
        throws UsernameNotFoundException
    {
        return userDao.fetchUserByUsername(userName);
    }
}
