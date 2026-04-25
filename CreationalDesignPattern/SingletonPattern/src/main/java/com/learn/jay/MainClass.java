package com.learn.jay;

import com.learn.jay.singleton.MySingleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        MySingleton singleton1 = MySingleton.getInstance();
        log.info("Singleton Instance 1: {}", singleton1);

        MySingleton singleton2 = MySingleton.getInstance();
        log.info("Singleton Instance 2: {}", singleton2);

        log.info("Singleton Instance 1 equals Singleton Instance 2: {}", singleton1.equals(singleton2));
        log.info("Singleton Instance 1 == Singleton Instance 2: {}", singleton1 == singleton2);
    }
}
