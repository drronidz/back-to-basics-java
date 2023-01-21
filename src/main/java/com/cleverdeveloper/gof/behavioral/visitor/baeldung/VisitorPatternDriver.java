package com.cleverdeveloper.gof.behavioral.visitor.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:46 PM
*/

import java.util.UUID;

public class VisitorPatternDriver {

    public static void main(String[] args) {

        Visitor visitor = new ElementVisitor();

        Document document = new Document(generateUUID());

        document.elements.add(new JSONElement(generateUUID()));
        document.elements.add(new JSONElement(generateUUID()));
        document.elements.add(new XMLElement(generateUUID()));

        document.accept(visitor);
    }

    private static String generateUUID() {
        return UUID.randomUUID().toString();
    }
}
