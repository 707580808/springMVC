package com.springmvc.springMvcAndMybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhuqiang on 16/11/16.
 */
@Controller
public class HelpController {
    @RequestMapping("/help")
    public ModelAndView help(){
        return new ModelAndView("help");
    }
}
