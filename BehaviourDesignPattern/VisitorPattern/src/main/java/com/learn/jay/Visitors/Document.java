package com.learn.jay.Visitors;

import com.learn.jay.Elements.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Document extends Element {

    public List<Element> elements = new ArrayList<>();

    public Document(UUID uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor v) {
        for (Element e : this.elements) {
            e.accept(v);
        }
    }
}
