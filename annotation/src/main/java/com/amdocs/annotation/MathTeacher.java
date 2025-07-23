package com.amdocs.annotation;

import org.springframework.stereotype.Component;

@Component("mathTeacher")
public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Teaching Mathematics");
    }
}