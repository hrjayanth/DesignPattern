package com.learn.jay.Elements;

import com.learn.jay.Visitors.Visitor;

import java.util.UUID;

public abstract class Element {

    public Element(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID uuid;

    public abstract void accept(Visitor v);

}
