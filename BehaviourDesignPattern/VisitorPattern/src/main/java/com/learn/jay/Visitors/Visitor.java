package com.learn.jay.Visitors;

import com.learn.jay.Elements.JSONElement;
import com.learn.jay.Elements.XMLElement;

public interface Visitor {
    void visit(XMLElement xe);
    void visit(JSONElement je);
}
