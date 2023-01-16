package com.cleverdeveloper.gof.behavioral.command.baeldung.receiver;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 11:18 PM
*/

public class TextFile {
    private final String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String read() {
        return "Reading file " + name;
    }

    public String write() {
        return "Writing to file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

    public String copy() {
        return "Copying file " + name;
    }

    public String paste() {
        return "Pasting file " + name;
    }
}
