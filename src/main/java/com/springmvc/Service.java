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
    public ModelAndView dologin(String username, String password, String s, String a) {
      if (username==null||"".equals(username)){
          return new  ModelAndView(s,"error","用户名为空");
      }

        if (password==null||"".equals(password)){
            return new  ModelAndView(s,"error","密码为空");
        }
        return new  ModelAndView(a);
    }
}
