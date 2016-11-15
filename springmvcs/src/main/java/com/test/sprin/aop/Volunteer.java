package com.test.sprin.aop;

import com.spring.Storage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Volunteer
 * Author: zq
 * Date：2016/9/28
 */
@Component
public class Volunteer implements Thinker {
    private String thoughts;
    public  void think(String thoughts){
        this.thoughts=thoughts;
    }
    public String getThoughts(){
        return thoughts;
    }

}
