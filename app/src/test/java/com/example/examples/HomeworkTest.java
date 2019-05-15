package com.example.examples;

import org.junit.Test;

public class HomeworkTest {

    @Test
    public void homework001() {
        Animal animal = new Animal(8);
        System.out.println("The animal has this many legs: " + animal.getLegs().size());

        Human human = new Human("Matt");
        System.out.println("This human has this many legs: " + human.getLegs().size());
        System.out.println("This human's name is " + human.getFirstName());

        Insect insect = new Insect(2);
        System.out.println("The insect has " + insect.getAntenna() + " antenna");

        Butterfly butterfly = new Butterfly("orange");
        System.out.println("This Butterfly's wings are " + butterfly.getColor());
        butterfly.drink( "lilly");
        butterfly.drink( "daisy");

        Monarch monarch = new Monarch(2);
        System.out.println("This Monarch has " + monarch.getEyes() + " big eyes and it's color is " + monarch.getColor());

        Male male = new Male(25, "Matt");
        System.out.println("This male's name is: " + male.getFirstName());
        System.out.println(male.getFirstName() + " has " + male.getmuscles() + " muscles");

        Female sally = new Female(2);
        System.out.println("Sally has " + sally.gethands() + " hands");

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
//3 household objects that need to be modeled. one method, one member variable