package com.amdocs.studentDependOnCourse;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThroughConstructorApplication {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Course course = (Course)context.getBean("course");
        System.out.println("Student Details : "+course);
	}
}
