package com.learn.jay;

import com.learn.jay.animalFamily.Animal;
import com.learn.jay.colorFamily.Color;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        log.info("=== Abstract Factory Pattern Demo ===");

        // 1. Get Animal Factory
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");

        if (animalFactory != null) {
            Animal dog = (Animal) animalFactory.create("Dog");
            log.info("Created Animal: " + dog.getAnimal());

            Animal cat = (Animal) animalFactory.create("Cat");
            log.info("Created Animal: " + cat.getAnimal());
        }

        log.info("-------------------------------------");

        // 2. Get Color Factory
        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");

        if (colorFactory != null) {
            Color red = (Color) colorFactory.create("Red");
            log.info("Created Color: " + red.getColor());

            Color blue = (Color) colorFactory.create("Blue");
            log.info("Created Color: " + blue.getColor());
        }

        log.info("=====================================");
    }
}
