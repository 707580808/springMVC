package com.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.util.concurrent.CountDownLatch;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * ZookeeperTest2
 * Author: zq
 * Date：2016/10/21
 */
public class ZookeeperTest2 implements Watcher{
    private static CountDownLatch countDownLatch=new CountDownLatch(1);
    public static void main(String[] args) throws Exception {
        //创建连接
        ZooKeeper zooKeeper = new ZooKeeper("127.0.0.1:2181", 5000, new ZookeeperTest2());
        String pa=zooKeeper.create("/","123".getBytes(), ZooDefs.Ids.CREATOR_ALL_ACL, CreateMode.EPHEMERAL);
        countDownLatch.await();
        long sessionId=zooKeeper.getSessionId();
        byte[] passwd=zooKeeper.getSessionPasswd();
        zooKeeper=new ZooKeeper("127.0.0.1:2181", 5000, new ZookeeperTest2(),1L,"test".getBytes());
        zooKeeper=new ZooKeeper("127.0.0.1:2181", 5000, new ZookeeperTest2(),sessionId,passwd);
        Thread.sleep(Integer.MAX_VALUE);
    }

    public void process(WatchedEvent watchedEvent) {
        System.out.println("asd"+watchedEvent);
        if(Watcher.Event.KeeperState.SyncConnected==watchedEvent.getState()){
            countDownLatch.countDown();
        }
    }
    class a implements AsyncCallback.StatCallback{

        public void processResult(int i, String s, Object o, Stat stat) {

        }
    }
}
