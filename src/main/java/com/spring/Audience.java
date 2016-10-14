package com.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Audience
 * Author: zq
 * Date：2016/9/27
 */
@Component
@Aspect
public class Audience {
    @Pointcut("execution(* com.spring.Song.performer()) ")
    public void performance(){

    }
    @Before("performance()")
    public void before(){
        System.out.println("i am before");
    }

    @Around("performance()")
    public  void around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            before();
            proceedingJoinPoint.proceed();
            after();
        }catch (Throwable throwable){
            System.out.println("error");
        }

    }
    @After("performance()")
    public void after(){
        System.out.println("i am after");
    }
}
