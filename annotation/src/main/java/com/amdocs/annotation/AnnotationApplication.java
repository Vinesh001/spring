package com.amdocs.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		School school = context.getBean(School.class);
		school.startSchool();
	}

}
