package com.learn.jay.singleton;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.*;

class MySingletonTest {

    @Test
    void getInstance() throws InterruptedException {
        MySingleton singletonInstance1 = MySingleton.getInstance();
        sleep(1000);
        MySingleton singletonInstance2 = MySingleton.getInstance();
        assertEquals(singletonInstance1.toString(), singletonInstance2.toString());
    }
}