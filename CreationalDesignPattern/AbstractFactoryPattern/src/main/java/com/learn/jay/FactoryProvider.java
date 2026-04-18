package com.learn.jay;

import com.learn.jay.animalFamily.AnimalFactory;
import com.learn.jay.colorFamily.ColorFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }

        return null;
    }
}
