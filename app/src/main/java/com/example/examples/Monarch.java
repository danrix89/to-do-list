package com.example.examples;

public class Monarch extends Butterfly {
    private int eyes;

    public Monarch(int eyes) {
        super("orange");
        this.eyes = eyes;
    }

    public int getEyes(){return eyes;}

    public String look (String openEyes) {
        String result = openEyes;
        openEyes(" opened eyes");
        result += " and looked around";

        return result;
    }

    private void openEyes(String s) {
    }

}

