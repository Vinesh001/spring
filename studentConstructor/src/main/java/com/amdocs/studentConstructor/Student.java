package com.amdocs.studentConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private List<String> name;
    private Map<String, String> address;
    private Set<String> subjects;

    Student() {
        // Default constructor for Spring
    }
    

    Student(List<String> name, Map<String, String> address, Set<String> subjects) {
        this.name = name;
        this.address = address;
        this.subjects = subjects;
    }

    public void printStudentDetails() {
        
        System.out.println("Student Name:");
        for(String e : name){
            System.out.print(e+", ");
        }

        System.out.println();
        System.out.println("Student address:");
        for(Map.Entry<String, String> e : address.entrySet()){
            System.out.print(e.getKey() + ": " + e.getValue() + ", ");
        }

        System.out.println();
        System.out.println("Student subjects:");
        for(String e : subjects){
            System.out.print(e+", ");
        }
    }
        
    


}