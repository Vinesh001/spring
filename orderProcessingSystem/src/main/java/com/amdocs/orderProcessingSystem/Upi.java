package com.amdocs.orderProcessingSystem;

import org.springframework.stereotype.Component;

@Component("upi")
public class Upi implements Payment {

    public void pay() {
        System.out.println("Upi");
    }
}