package com.springmvc;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * BaseController
 * Author: zq
 * Date：2016/11/11
 */
public class BaseController {
    @ExceptionHandler(MyException.class)
    public ModelAndView handleException(Exception e, HttpServletRequest request){
        request.setAttribute("error",e.getMessage());
        return new ModelAndView("exception");
    }
}
