package com.example.examples;

public class Butterfly extends FlyingInsect {
    public String color;

    public Butterfly(String color) {
        super(2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String drink (String extend ) {
        String result = extend;

        result += " probiscus";

        return result;
    }
}