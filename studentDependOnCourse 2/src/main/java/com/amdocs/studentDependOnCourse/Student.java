package com.amdocs.studentDependOnCourse;

public class Student {
    private Course course;

    Student() {
    }
    

    Student(Course course) {
        this.course = course;
    }


    public Course getCourse() {
        return course;
    }

    // @Override
    // public String toString() {
    //     return "Student{" +
    //             ", course=" + course +
    //             '}';
    // }
}