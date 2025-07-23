package com.amdocs.fileLogManager;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // Force initialization of the bean
        context.getBean("fileManager");

        // Register shutdown hook to call destroy()
        context.registerShutdownHook();
    }
}
