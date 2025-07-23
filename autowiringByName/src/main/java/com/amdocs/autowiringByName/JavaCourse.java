package com.amdocs.autowiringByName;

import org.springframework.stereotype.Component;

@Component("javaCourse")
public class JavaCourse implements Course {

    @Override
    public void getCourseName() {
        System.out.println("Java Programming Course");
    }
}