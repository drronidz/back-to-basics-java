package com.cleverdeveloper.gof.behavioral.command.baeldung.command;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 11:12 PM
*/

import com.cleverdeveloper.gof.behavioral.command.baeldung.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation{

    private final TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
