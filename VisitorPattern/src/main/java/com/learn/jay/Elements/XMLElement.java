package com.learn.jay.Elements;

import com.learn.jay.Visitors.Visitor;

import java.util.UUID;

public class XMLElement extends Element {
    public XMLElement(UUID uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
