package com.learn.jay;

public interface AbstractFactory<T> {

    T create(String type);
}
