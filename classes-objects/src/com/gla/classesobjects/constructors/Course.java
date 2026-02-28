package com.gla.classesobjects.constructors;

public class Course {
    private String courseName;
    private static String instituteName = "GLA Institute";

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Institute: " + instituteName);
    }
}
