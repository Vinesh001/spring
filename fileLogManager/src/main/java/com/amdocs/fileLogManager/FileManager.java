package com.amdocs.fileLogManager;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FileManager implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("File opened: login.txt");

        System.out.println("Login message: written to file.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("File closed: login.txt");
    }
}
