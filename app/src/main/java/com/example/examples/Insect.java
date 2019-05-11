package com.example.examples;

public class Insect extends Animal {

    private int antenna;

    public Insect(int antenna) {
        super(6);
        this.antenna = antenna;
    }

    public int getAntenna() {
        return antenna;
    }


}

