package com.time.now.service;

import org.springframework.security.core.userdetails.User;

public interface UserService {
    User fetchLogedinUser();

}
