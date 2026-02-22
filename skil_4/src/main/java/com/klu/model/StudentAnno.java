package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentAnno {

    @Value("201")
    private int studentId;

    @Value("Uday")
    private String name;

    private String course;
    private int year;

    // Constructor Injection
    public StudentAnno(
            @Value("AI & ML") String course,
            @Value("2025") int year) {
        this.course = course;
        this.year = year;
    }

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Year       : " + year);
    }
}