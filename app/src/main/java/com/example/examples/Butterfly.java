package com.example.examples;

public class Butterfly extends FlyingInsect {
    private String color;

    public Butterfly(String color) {
        super(2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void drink (String flowerType) {
        System.out.println("The " + color + " butterfly extends its probiscus into a " + flowerType + " flower");

    }
}