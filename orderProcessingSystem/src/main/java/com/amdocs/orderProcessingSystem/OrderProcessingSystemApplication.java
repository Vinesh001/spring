package com.amdocs.orderProcessingSystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderProcessingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		FinalOrder order = context.getBean(FinalOrder.class);
	}

}
