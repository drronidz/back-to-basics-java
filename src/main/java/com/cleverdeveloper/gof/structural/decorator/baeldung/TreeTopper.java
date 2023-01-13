package com.cleverdeveloper.gof.structural.decorator.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 2:56 PM
*/

public class TreeTopper extends TreeDecorator {

    public TreeTopper(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithTreeTopper();
    }

    private String decorateWithTreeTopper() {
        return " with Tree Topper";
    }
}
