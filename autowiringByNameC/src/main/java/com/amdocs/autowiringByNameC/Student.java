package com.amdocs.autowiringByNameC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    // @Autowired
    // @Qualifier("javaCourse") // or "pythonCourse" based on your requirement
    private Course course;

    @Autowired
    public Student(@Qualifier("javaCourse") Course course) {
        this.course = course;
        System.out.println("Student created with course: " );
    }
    

    public void showCourse() {
        course.getCourseName();
    }
}