package com.learn.jay.factory;

import com.learn.jay.shapes.*;
import com.learn.jay.utils.ShapeType;

public class ShapeFactory {

    public static Shape getShape(ShapeType shapeType) {
        Shape requestedShape;
        switch (shapeType) {
            case SQUARE:
                requestedShape = new Square();
                break;

            case CIRCLE:
                requestedShape = new Circle();
                break;

            case TRIANGLE:
                requestedShape = new Triangle();
                break;

            case RECTANGLE:
                requestedShape = new Rectangle();
                break;

            default:
                requestedShape = new Circle();
                break;
        }

        return requestedShape;
    }
}
