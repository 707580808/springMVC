package com.spring;

import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Song
 * Author: zq
 * Date：2016/9/26
 */
@Component
public class Song implements Performer {

    public  void performer()throws Exception{
        System.out.println("I am Song:");
    }
}
