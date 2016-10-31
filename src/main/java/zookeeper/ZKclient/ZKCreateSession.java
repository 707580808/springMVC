package zookeeper.ZKclient;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * ZKCreateSession
 * Author: zq
 * Date：2016/10/28
 */
public class ZKCreateSession {
    public static void main(String[] args) {
        ZkClient zkClient=new ZkClient("192.168.10.128:2181",10000,10000,new SerializableSerializer());
        System.out.println("iuhed");
    }
}
