package com.example.examples;

public class Human extends Animal {

    private String firstName;

    public Human(String firstName) {
        super(2);
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}
