package com.learn.jay;

import com.learn.jay.animalFamily.Animal;
import com.learn.jay.animalFamily.AnimalFactory;
import com.learn.jay.colorFamily.Color;
import com.learn.jay.colorFamily.ColorFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryTester {

    @Test
    public void TestAnimal() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
        if(abstractFactory instanceof AnimalFactory) {
            AnimalFactory animalFactory = (AnimalFactory) abstractFactory;
            Animal animal = animalFactory.create("Dog");

            assertEquals(animal.getAnimal(), "Dog");
        }
    }

    @Test
    public void TestColor() {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Color");
        if(abstractFactory instanceof ColorFactory) {
            ColorFactory animalFactory = (ColorFactory) abstractFactory;
            Color color = animalFactory.create("Red");

            assertEquals(color.getColor(), "Red");
        }
    }
}
