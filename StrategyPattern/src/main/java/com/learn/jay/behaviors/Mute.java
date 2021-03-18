package com.learn.jay.behaviors;

public class Mute implements QuackBehavior {
    @Override
    public void quack() {
        System.err.println("Can't quack!!");
    }
}
