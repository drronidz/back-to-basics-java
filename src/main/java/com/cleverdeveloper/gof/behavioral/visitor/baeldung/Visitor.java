package com.cleverdeveloper.gof.behavioral.visitor.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:40 PM
*/

public interface Visitor {
    public void visit(XMLElement xmlElement);
    public void visit(JSONElement jsonElement);
}
