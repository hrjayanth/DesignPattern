package com.learn.jay.Visitors;

import com.learn.jay.Elements.JSONElement;
import com.learn.jay.Elements.XMLElement;

public class ElementVisitor implements Visitor {
    @Override
    public void visit(XMLElement xe) {
        System.out.println("processing an XML element with uuid: " + xe.uuid);
    }

    @Override
    public void visit(JSONElement je) {
        System.out.println("processing a JSON element with uuid: " + je.uuid);
    }
}
