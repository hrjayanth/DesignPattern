package com.learn.jay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * ConcretePrototype — Circle.
 * Uses a copy constructor to implement the clone() contract.
 */
@Data
@AllArgsConstructor
@Slf4j
public class Circle implements Shape {

    private String color;
    private int radius;
    private int x;
    private int y;

    /** Copy constructor — used by clone(). */
    private Circle(Circle source) {
        this.color = source.color;
        this.radius = source.radius;
        this.x = source.x;
        this.y = source.y;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public void draw() {
        log.info("  Circle   | color=%-8s | radius=%3d | position=(%d, %d)%n",
                color, radius, x, y);
    }

    @Override
    public String getType() {
        return "Circle";
    }
}
