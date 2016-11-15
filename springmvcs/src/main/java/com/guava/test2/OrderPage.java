package com.guava.test2;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

public class OrderPage {

	public static EventBus eventBus = new EventBus();
    public OrderPage(EventBus eventBus){
		this.eventBus=eventBus;
	}
	public void submitOrder() {
		Integer userId = 1;
		BigDecimal amount = BigDecimal.TEN;
        PaymentService paymentService=new PaymentService(eventBus);
		eventBus.post(new PayEvent(userId, amount));
	}

}

class PaymentService {

	private MailService mailService;

	public  PaymentService(EventBus eventBus){
		eventBus.register(this);
	}
	@Subscribe
	public void doPayment(PayEvent  payEvent) {
		// Do payment...
		mailService=new MailService();
		mailService.sendPaymentEmail(payEvent.getUserId(), payEvent.getAmount());
		System.out.println("hediwehfiu");
	}

}

class UserService {

	public String getEmailAddress(Integer userId) {
		return "foo@bar.com";
	}
   public  UserService(EventBus eventBus){
	eventBus.register(this);
}
	@Subscribe
	public void registerPayment(PayEvent payEvent) {
		System.out.println("ojfo");
	}
}

class PayEvent {

	private Integer userId;
	private BigDecimal amount;
	
	public PayEvent(Integer userId, BigDecimal amount) {
		this.userId=userId;
		this.amount=amount;
	}
	
	public Integer getUserId() {
		return userId;
	}
	public BigDecimal getAmount() {
		return amount;
	}


 public static void main(String[] args) {
	 /*EventBus eventBus=new EventBus();
	 PaymentService paymentService=new PaymentService(eventBus);
	 UserService userService=new UserService(eventBus);
	 OrderPage orderPage=new OrderPage(eventBus);
	 orderPage.submitOrder();*/
//	 ApplicationContext applicationContext=new ClassPathXmlApplicationContext("web/spring.xml");


    	//eventBus.post(new PayEvent(1,BigDecimal.ONE));
	 EventBus eventBus=new EventBus();
	 OrderPage orderPage=new OrderPage(eventBus);
	 orderPage.submitOrder();
	}
}