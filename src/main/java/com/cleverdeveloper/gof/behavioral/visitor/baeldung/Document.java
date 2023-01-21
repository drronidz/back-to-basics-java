package com.cleverdeveloper.gof.behavioral.visitor.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:44 PM
*/

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element element : this.elements) {
            element.accept(visitor);
        }
    }
}
