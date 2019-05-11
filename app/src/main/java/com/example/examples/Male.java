package com.example.examples;

public class Male extends Human {

    private String muscles;

    public Male(String muscles){
        super("Greg");
        this.muscles = muscles;
    }

    public String getmuscles(){return muscles;}
}
