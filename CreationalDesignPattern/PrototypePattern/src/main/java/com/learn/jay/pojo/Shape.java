package com.learn.jay.pojo;

/**
 * Prototype interface — declares the clone contract.
 * All concrete shapes must implement this.
 */
public interface Shape {
    Shape clone();

    void draw();

    String getType();
}
