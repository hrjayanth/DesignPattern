package com.learn.jay.singleton;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

class MySingletonTest {

    @Test
    void getInstance() throws InterruptedException {
        MySingleton singletonInstance1 = MySingleton.getInstance();
        System.out.println("Singleton Instance 1: " + singletonInstance1);

        sleep(10000);

        MySingleton singletonInstance2 = MySingleton.getInstance();
        System.out.println("Singleton Instance 2: " + singletonInstance2);

        assertEquals(singletonInstance1, singletonInstance2);
    }
}