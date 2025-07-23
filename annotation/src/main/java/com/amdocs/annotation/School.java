package com.amdocs.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class School{
    private Teacher teacher;

    @Autowired
    @Qualifier("scienceTeacher") // or "mathTeacher" based on your requirement
     public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    
    public void startSchool() {
        System.out.println("School is starting...");
        teacher.teach();
    }

    
}