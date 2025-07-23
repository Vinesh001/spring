package com.amdocs.orderProcessingSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinalOrder{

    private Order order;
    private Payment payment;

    @Autowired
    public FinalOrder(@Qualifier("amazon") Order order, @Qualifier("upi") Payment payment) {
        this.order = order;
        this.payment = payment;
        order.processOrder();
        payment.pay();
        System.out.println("Final order processed successfully.");
    }
}