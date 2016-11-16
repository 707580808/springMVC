package com.springmvc.inandexception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.xml.ws.Service;
import java.util.List;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * mvcController
 * Author: zq
 * Date：2016/9/14
 */
@Controller
public class mvcController extends BaseController{
    @Resource
    private Service service;
    @Resource
    private HttpServletRequest request;

    @RequestMapping("/loginPage")
    public ModelAndView test(Model model) {

        return new ModelAndView("login");
       /* model.addAttribute("greeting", "Hello Spring MVC");
        return "test";
*/
    }
    @RequestMapping("/exception")
 public void throwException() throws MyException {
     throw new MyException("异常");
 }
    @RequestMapping("/user")
    public ModelAndView toUserHome(Model model) {

        return new ModelAndView("userhome");
       /* model.addAttribute("greeting", "Hello Spring MVC");

        return "test";
*/
    }

    @RequestMapping("/login")
    public ModelAndView hello(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> list = bindingResult.getFieldErrors();
            for (FieldError f :
                    list) {
                request.setAttribute("ERR_" + f.getField(), f.getDefaultMessage());

            }
            return new ModelAndView("login");
        }
        try {
            String username = user.getUsername();

            String password = user.getPassword();
            String a = "com/test";
            String s = "login";
//            user = service.dologin(username, password);
            request.setAttribute("user", user);
            return new ModelAndView("userhome");
        } catch (Exception e) {
            return new ModelAndView("login");
        }
     /*   return  service.dologin(username,password,s,a);*/
       /* model.addAttribute("greeting", "Hello Spring MVC");

        return "test";
*/
    }
}
