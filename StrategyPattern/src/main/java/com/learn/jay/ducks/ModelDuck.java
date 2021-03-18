package com.learn.jay.ducks;

import com.learn.jay.behaviors.CantFly;
import com.learn.jay.behaviors.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new CantFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
