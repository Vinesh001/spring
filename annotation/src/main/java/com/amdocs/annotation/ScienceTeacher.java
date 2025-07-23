package com.amdocs.annotation;

import org.springframework.stereotype.Component;

@Component("scienceTeacher")
public class ScienceTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Teaching Science");
    }
}