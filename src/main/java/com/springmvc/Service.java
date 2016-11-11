package com.springmvc;


import org.springframework.web.servlet.ModelAndView;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Service
 * Author: zq
 * Date：2016/11/3
 */
@org.springframework.stereotype.Service
public class Service {
    public User dologin(String username, String password) {
     User user=new User();
        user.setPassword(password);
        user.setUsername(username);
        user.setQq("70787786");
        return user;
    }
}
