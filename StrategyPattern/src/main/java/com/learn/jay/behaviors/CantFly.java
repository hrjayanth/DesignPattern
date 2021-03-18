package com.learn.jay.behaviors;

public class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        System.err.println("Can't Fly");
    }
}
