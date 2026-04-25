package com.learn.jay;

import com.learn.jay.factory.ShapeFactory;
import com.learn.jay.shapes.Shape;
import com.learn.jay.utils.ShapeType;

public class MainClass {
    public static void main(String[] args) {
        getAndDrawShape(ShapeType.CIRCLE);
        getAndDrawShape(ShapeType.RECTANGLE);
        getAndDrawShape(ShapeType.SQUARE);
        getAndDrawShape(ShapeType.TRIANGLE);
    }

    private static void getAndDrawShape(ShapeType type) {
        Shape shape = ShapeFactory.getShape(type);
        shape.draw();
    }
}
