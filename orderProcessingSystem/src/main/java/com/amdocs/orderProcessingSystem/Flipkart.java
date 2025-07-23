package com.amdocs.orderProcessingSystem;

import org.springframework.stereotype.Component;

@Component("flipkart")
public class Flipkart implements Order {

    public void processOrder() {
        System.out.println("Processing order in Amazon");
    }
}