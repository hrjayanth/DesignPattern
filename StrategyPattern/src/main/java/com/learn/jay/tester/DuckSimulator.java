package com.learn.jay.tester;

import com.learn.jay.behaviors.FlyWithSupport;
import com.learn.jay.ducks.Duck;
import com.learn.jay.ducks.ModelDuck;

import static java.lang.Thread.sleep;

public class DuckSimulator {
    public static void main(String[] args) throws InterruptedException {
        Duck duck = new ModelDuck();

        sleep(1);
        duck.display();
        sleep(1);
        duck.performFly();
        sleep(1);
        duck.performQuack();

        sleep(1);
        duck.setFlyBehavior(new FlyWithSupport());
        duck.performFly();
    }
}
