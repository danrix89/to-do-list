package com.example.examples;

import org.junit.Test;

public class HomeworkTest {

    @Test
    public void homework001() {
        Animal octopus = new Animal(8);
        System.out.println("The animal has this many legs: " + octopus.getLegs().size());

        Human matt = new Human("Matt");
        System.out.println("This human has this many legs: " + matt.getLegs().size());
        System.out.println("This human's name is: " + matt.getFirstName());

        // Homework:
        // Make an insect class
        // Make a flying insect class
        // Make a butterfly class
        // Make a monarch butterfly class
        // Make a "Male" human class
        // Make a "Female" human class
        // For each of the above classes give them at least 1 defining private "member variable" (attribute) with a public "get" method
        // For each of the above classes give them at least 1 defining public "method" (action)
        // Add an instance of each of these classes into this test and output things to the console
    }

}
