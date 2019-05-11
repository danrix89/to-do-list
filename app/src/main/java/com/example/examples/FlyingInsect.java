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

}
