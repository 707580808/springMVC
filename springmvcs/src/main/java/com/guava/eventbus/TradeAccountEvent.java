package com.guava.eventbus;

import java.util.Date;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * TradeAccountEvent
 * Author: zq
 * Date：2016/10/11
 */
public class TradeAccountEvent {
    private double amount;
    private Date tradeExecutionTime;
    private TradeType tradeType;
    private TradeAccount tradeAccount;

    public  TradeAccountEvent(double amount,Date tradeExecutionTime, TradeType tradeType ,TradeAccount tradeAccount){
        checkArgument(amount>0, "Trade can't be less than zero");
        this.amount=amount;
        this.tradeExecutionTime=checkNotNull(tradeExecutionTime, "ExecutionTime can't be null");
        this.tradeAccount=checkNotNull(tradeAccount,"tradeAccount can't be null");
        this.tradeType=checkNotNull(tradeType,"tradeType can't be null");
    }
}

