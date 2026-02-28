package com.gla.classesobjects.constructors;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}
