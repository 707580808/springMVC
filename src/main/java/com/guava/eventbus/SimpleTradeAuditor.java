package com.guava.eventbus;

import com.google.common.collect.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import java.util.Date;
import java.util.List;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * SimpleTradeAuditor
 * Author: zq
 * Date：2016/10/12
 */
/*
public class TradeAccountEvent {
    private double amount;
    private Date tradeExecutionTime;
    private TradeType tradeType;
    private TradeAccount tradeAccount;

    public void TradeAccountEvent(double amount,Date tradeExecutionTime, TradeType tradeType ,TradeAccount tradeAccount){
        checkArgument(amount>0, "Trade can't be less than zero");
        this.amount=amount;
        this.tradeExecutionTime=checkNotNull(tradeExecutionTime, "ExecutionTime can't be null");
        this.tradeAccount=checkNotNull(tradeAccount,"tradeAccount can't be null");
        this.tradeType=checkNotNull(tradeType,"tradeType can't be null");
    }
*/

public class SimpleTradeAuditor {
    public List<TradeAccountEvent> list= Lists.newArrayList();
    public SimpleTradeAuditor(EventBus eventBus){
        eventBus.register(this);
    }
    @Subscribe
    public void auditTrade(TradeAccountEvent tradeAccountEvent){
        list.add(tradeAccountEvent);
        System.out.println(tradeAccountEvent);
    }
    public static void main(String[] args) {
        EventBus eventBus=new EventBus();
        SimpleTradeAuditor simpleTradeAuditor=new SimpleTradeAuditor(eventBus);
        eventBus.post(new TradeAccountEvent(74,new Date(),new TradeType(),new TradeAccount()));
    }
}
