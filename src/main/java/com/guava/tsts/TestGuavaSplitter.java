package com.guava.tsts;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.Iterables;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * TestGuavaSplitter
 * Author: zq
 * Date：2016/9/28
 */
public class TestGuavaSplitter {
    public static void main(String[] args ){
     /*   System.out.println(Splitter.on("|").trimResults().split("   wegduywe|pojiedo|edew    "));
        Splitter splitter=Splitter.on("|");
        splitter.trimResults();
        Iterable<String> strings=splitter.split("wef|wef|WE    ")  ;
        System.out.println(strings);
        String startString = "Washington D.C=Redskins#New York City=Giants#philadelphina=Eagles#Dallas=cowboys";
        Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
        Map<String ,String> splitMap = mapSplitter.split(startString);
        System.out.println(splitMap.get("Washington D.C"));
        System.out.println(Strings.padEnd("foo",6,'x'));
        CharMatcher cm = CharMatcher.JAVA_DIGIT.or(CharMatcher.WHITESPACE);
        System.out.println(cm.retainFrom("asihdidhe11saxnak111    asiuhxi"));*/
        System.out.println(new Date());
        Date date=new Date();
        date.setTime(date.getTime()+780*60*1000);
        System.out.println(date);

    }
}
