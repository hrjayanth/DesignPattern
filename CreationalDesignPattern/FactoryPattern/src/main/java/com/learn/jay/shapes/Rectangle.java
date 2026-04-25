package com.learn.jay.shapes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Shape {
    @Override
    public void draw() {
        log.info("Drawing Rectangle");
    }
}
