package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Jugger
 * Author: zq
 * Date：2016/9/19
 */
@Component
public class Juggler implements Performer {
  /*  private int beans=3;
    public  Juggler(int bean){
        this.beans=bean;
    }*/

    public  Juggler(){
    }

    public  void performer()throws Exception{
        System.out.println("I am juggler:");
    }
    public static void main(String[] args) throws Exception{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("web/spring.xml");
         Storage performer=(Storage)applicationContext.getBean("storage");
        Song song=(Song)applicationContext.getBean("song");
        song.performer();
        Contestant contestant=(Contestant) applicationContext.getBean("juggler");
        contestant.receiveAward();
//        performer.performer.performer();
//
    }
}
