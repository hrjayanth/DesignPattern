package com.learn.jay.observer;

public interface Channel {
    public void update(Object o);

    public void broadcast();
}
