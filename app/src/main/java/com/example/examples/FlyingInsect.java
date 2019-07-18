package com.example.examples;

public class FlyingInsect extends Insect {

    private int wings;

    public FlyingInsect(int wings) {
        super(2);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }


    public String fly(String flap) {
        String result = flap;

        result += " wings";

        return result;
    }
}
