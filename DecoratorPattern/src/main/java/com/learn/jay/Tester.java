package com.learn.jay;

import com.learn.jay.decorator.RedShapeDecorator;
import com.learn.jay.shape.Circle;
import com.learn.jay.shape.Rectangle;
import com.learn.jay.shape.Shape;

public class Tester {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();

    }
}
