package com.gla.classesobjects.constructors;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayDetails() {
        System.out.println("Circle radius: " + radius);
    }
}
