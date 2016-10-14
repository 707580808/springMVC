package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Storage
 * Author: zq
 * Date：2016/9/21
 */
@Component
public class Storage {


    @Autowired
    @Qualifier("song")
    public  Performer performer;

    public Performer getPerformer() {
        return performer;
    }

    public void setPerformer(Performer performer) {
        this.performer = performer;
    }
}


