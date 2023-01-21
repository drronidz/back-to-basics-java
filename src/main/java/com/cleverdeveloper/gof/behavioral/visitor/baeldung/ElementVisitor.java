package com.cleverdeveloper.gof.behavioral.visitor.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:43 PM
*/

public class ElementVisitor implements Visitor {

    @Override
    public void visit(XMLElement xmlElement) {
        System.out.println("Processing XML element with uuid: " + xmlElement.uuid);
    }

    @Override
    public void visit(JSONElement jsonElement) {
        System.out.println("Processing JSON element with uuid: " + jsonElement.uuid);
    }
}
