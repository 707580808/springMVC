package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * mvcController
 * Author: zq
 * Date：2016/9/14
 */
@Controller
@RequestMapping("/mvc")
public class mvcController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("greeting", "Hello Spring MVC");

        return"test";

    }
}
