
package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id = 501;
    private String name = "GitHub";
    private String DateOfCompletion = "03-12-2025";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCompletion() {
        return DateOfCompletion;
    }

    @Override
    public String toString() {
        return "Certification [id=" + id + 
               ", Name=" + name + 
               ", DateOfCompletion=" + DateOfCompletion + "]";
    }
}