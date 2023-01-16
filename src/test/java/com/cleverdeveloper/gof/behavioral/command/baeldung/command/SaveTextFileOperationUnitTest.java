package com.cleverdeveloper.gof.behavioral.command.baeldung.command;

import com.cleverdeveloper.gof.behavioral.command.baeldung.receiver.TextFile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 11:42 PM
*/

class SaveTextFileOperationUnitTest {
    @Test
    void given_OpenTextFileOperationInstance_when_called_execute_method_then_oneAssertion() {
        TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("fileOne.txt"));
        assertEquals(saveTextFileOperation.execute(), "Saving file fileOne.txt");
    }
}