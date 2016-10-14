package com.spring;

import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * contestantDelegate
 * Author: zq
 * Date：2016/10/8
 */

public class ContestantDelegate implements Contestant {

    public void receiveAward(){
        System.out.println("i am receive");
    }

}
