package com.learn.jay.colorFamily;

import com.learn.jay.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if ("Red".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("Blue".equalsIgnoreCase(type)) {
            return new Blue();
        }

        return null;
    }
}
