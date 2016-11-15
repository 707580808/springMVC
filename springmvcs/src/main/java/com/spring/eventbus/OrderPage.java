package com.spring.eventbus;

import java.math.BigDecimal;

/**
 * 业务功能名称
 * Copyright (C), 2015-2016 中盈优创
 * OrderPage
 * Author: zq
 * Date：2016/10/10
 */
public class OrderPage {
    private PaymentService paymentService;
    private UserService userService;
    public void submitOrder() {
        Integer userId = 1;
        BigDecimal amount = BigDecimal.TEN;

        paymentService.doPayment(userId, amount);
        userService.registerPayment(userId, amount);
    }
}
class PaymentService {

    private MailService mailService;

    public void doPayment(Integer userId, BigDecimal amount) {
        //Do payment...
        mailService.sendPaymentEmail(userId, amount);
    }
}
 class UserService {

    public String getEmailAddress(Integer userId) {
        return "foo@bar.com";
    }

    public void registerPayment(Integer userId, BigDecimal amount) {
        //Register payment in database...
    }
}

 class MailService {

    private UserService userService;

    public void sendPaymentEmail(Integer userId, BigDecimal amount) {
        String emailAddress = userService.getEmailAddress(userId);
        //Send email...
    }
}

