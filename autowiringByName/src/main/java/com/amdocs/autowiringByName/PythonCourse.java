package com.amdocs.autowiringByName;

import org.springframework.stereotype.Component;

@Component("pythonCourse")
public class PythonCourse implements Course {

    @Override
    public void getCourseName() {
        System.out.println("Python Programming Course");
    }
}