package com.amdocs.studentDependOnCourse;

public class Course{
    private String course;
    Course(String course) {
        this.course = course;
    }
    public String getCourse() {
        return course;
    }
    @Override
    public String toString(){
        return "Course{" +
                "course='" + course + '\'' +
                '}';
    }
}