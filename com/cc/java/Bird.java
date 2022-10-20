package com.cc.java;

public class Bird implements Flyable,IFeather {

    @Override
    public String fly() {
        return "I'm a bird, I can fly";
    }

    @Override
    public String hasFeathers() {
        return "I'm a bird, I have feathers";
    }
}
