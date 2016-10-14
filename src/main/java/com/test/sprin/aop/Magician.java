package com.test.sprin.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Magician
 * Author: zq
 * Date：2016/9/28
 */
@Component
public class Magician implements MindReader {
    @Autowired
    private Thinker thinker;
    private String thoughts;
    public void interceptThoughts(String thoughts){
        System.out.println("I am magician");
        this.thoughts=thoughts;
        System.out.println(thoughts);
    }
   public String getThoughts(){
        return thoughts;
    }
    public static void main(String[] args) throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("web/spring.xml");
        Volunteer volunteer=(Volunteer)applicationContext.getBean("volunteer");
        volunteer.think("hoh");
        System.out.println(volunteer.getThoughts());
    }
}
