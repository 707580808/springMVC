package com.guava.tsts;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * TestGuava
 * Author: zq
 * Date：2016/9/21
 */
public class TestGuavaJoiner {
//    Optional<Integer> optional =Optional.of(null);
    public static void main(String[] args ){

        List<String> list=new ArrayList<String>();
        list.add("oijxdwo");
        list.add("oijxdwo");
        list.add("oijxdwo");
     String s=  Joiner.on("|").useForNull("rjfi").join(1,"rfrfdv","srfwer");
        Joiner joiner=Joiner.on("|").useForNull("null");
        StringBuilder stringBuilder=new StringBuilder();
         joiner.appendTo(stringBuilder,"wedw","efij","ferf");
        System.out.println(stringBuilder);
        System.out.println(s+":"+Joiner.on("|").useForNull("null").join("ded",null));
        String expectedString = "Washington D.C=Redskins#New York City=Giants#philadelphina=Eagles#Dallas=cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington D.C", "Redskins");
        testMap.put("New York City", "Giants");
        testMap.put("Philadelphia", "Eagles");
        testMap.put("Dallas","Cowboys");
        String returnedString = Joiner.on("#").withKeyValueSeparator("=").join(testMap);
        System.out.println(returnedString);
    }

}
