package com.learn.jay;

import com.learn.jay.Elements.JSONElement;
import com.learn.jay.Elements.XMLElement;
import com.learn.jay.Visitors.Document;
import com.learn.jay.Visitors.ElementVisitor;
import com.learn.jay.Visitors.Visitor;

import java.util.UUID;


public class VisitorDemo {

    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JSONElement(generateUuid()));
        d.elements.add(new JSONElement(generateUuid()));
        d.elements.add(new XMLElement(generateUuid()));

        d.accept(v);
    }

    public static UUID generateUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
}
