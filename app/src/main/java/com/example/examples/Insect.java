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

    public String crawl (String moveLegs) {
        moveLegs("move legs");
        String result = moveLegs;
        result += " and begins to crawl";

        return result;
    }

    private void moveLegs(String move_legs) {
    }
}

