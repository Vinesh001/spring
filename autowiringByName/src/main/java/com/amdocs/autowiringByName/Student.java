package com.amdocs.autowiringByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    @Qualifier("javaCourse") // or "pythonCourse" based on your requirement
    private Course course;

    public void showCourse() {
        course.getCourseName();
    }
}