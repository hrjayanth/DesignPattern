package com.learn.jay.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * ConcretePrototype — Rectangle.
 * Uses a copy constructor to implement the clone() contract.
 */
@Data
@AllArgsConstructor
@Slf4j
public class Rectangle implements Shape {

    private String color;
    private int width;
    private int height;
    private int x;
    private int y;

    /** Copy constructor — used by clone(). */
    private Rectangle(Rectangle source) {
        this.color = source.color;
        this.width = source.width;
        this.height = source.height;
        this.x = source.x;
        this.y = source.y;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public void draw() {
        log.info("  Rectangle | color=%-8s | %dx%d      | position=(%d, %d)%n",
                color, width, height, x, y);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }
}
