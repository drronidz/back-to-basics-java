package com.cleverdeveloper.gof.behavioral.command.baeldung.client;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 11:24 PM
*/

import com.cleverdeveloper.gof.behavioral.command.baeldung.command.OpenTextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.command.SaveTextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.command.TextFileOperation;
import com.cleverdeveloper.gof.behavioral.command.baeldung.invoker.TextFileOperationExecutor;
import com.cleverdeveloper.gof.behavioral.command.baeldung.receiver.TextFile;

public class CommandPatternDriver {
    public static void main(String[] args) {
        TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("fileOne.txt"));
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("fileTwo.txt"));
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(openTextFileOperation));
        System.out.println(textFileOperationExecutor.executeOperation(saveTextFileOperation));
    }
}
