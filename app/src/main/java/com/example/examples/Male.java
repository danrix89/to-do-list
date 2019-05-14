package com.example.examples;

public class Male extends Human {

    private String muscles;

    public Male(String muscles) {
        super("Greg");
        this.muscles = muscles;
    }

    public String getmuscles() {
        return muscles;
    }


    public boolean hunt() {
        boolean huntStatus;
        int quiver;
        quiver = 5;
        int arrowsRequired;
        arrowsRequired = 3;
        if (quiver > arrowsRequired) {
            huntStatus = true;
        } else {
            huntStatus = false;
        }
        return huntStatus;


    }
}




