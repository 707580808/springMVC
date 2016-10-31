package com.zookeeper;

import org.apache.log4j.pattern.CachedDateFormat;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.util.concurrent.CountDownLatch;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * Zookeeper
 * Author: zq
 * Date：2016/10/20
 */
public class ZookeeperTest implements Watcher{
    private static CountDownLatch countDownLatch=new CountDownLatch(1);
    public static void main(String[] args) throws Exception{
        try {  //创建连接
        ZooKeeper zooKeeper=new ZooKeeper("192.168.10.128:2181",5000,new ZookeeperTest ());
        System.out.println(zooKeeper.getState());
        System.out.println("zk 客户端的sessionId=" + zooKeeper.getSessionId() + ",  sessionPasswd是："
                + new String(zooKeeper.getSessionPasswd()));

            countDownLatch.await();
        }catch (Exception e){
            System.out.println("failed");
        }
        System.out.println("establish");
    }

    public void process(WatchedEvent event){
        System.out.println("asd"+event);
        if(Watcher.Event.KeeperState.SyncConnected==event.getState()){
            countDownLatch.countDown();
        }
    }
}
