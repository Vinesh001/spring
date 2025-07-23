package com.amdocs.orderProcessingSystem;

import org.springframework.stereotype.Component;

@Component("razorpay")
public class Rajorpay implements Payment {

    public void pay() {
        System.out.println("rajorpay");
    }
}