package com.learn.jay;

import com.learn.jay.color.Red;
import com.learn.jay.shape.Shape;
import com.learn.jay.shape.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatternTester {
    @Test
    public void whenBridgePatternInvoked_thenConfigSuccess() {
        //a square with red color
        Shape square = new Square(new Red());
        assertEquals(square.draw(), "Square drawn. Color is Red");
    }
}
