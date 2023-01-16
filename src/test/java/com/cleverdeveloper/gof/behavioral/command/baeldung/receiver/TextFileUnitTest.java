package com.cleverdeveloper.gof.behavioral.command.baeldung.receiver;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/17/2023 12:11 AM
*/

class TextFileUnitTest {

    private static TextFile textFile;

    @BeforeEach
    void setUp() {
        textFile = new TextFile("fileOne.txt");
    }

    @Test
    void given_textFileInstance_when_called_write_open_method_then_one_assertion() {
        assertEquals(textFile.open(), "Opening file fileOne.txt");
    }

    @Test
    void given_textFileInstance_when_called_write_read_method_then_one_assertion() {
        assertEquals(textFile.write(), "Writing to file fileOne.txt");
    }

    @Test
    void given_textFileInstance_when_called_write_save_method_then_one_assertion() {
        assertEquals(textFile.save(), "Saving file fileOne.txt");
    }

    @Test
    void given_textFileInstance_when_called_write_copy_method_then_one_assertion() {
        assertEquals(textFile.copy(), "Copying file fileOne.txt");
    }

    @Test
    void given_textFileInstance_when_called_write_past_method_then_one_assertion() {
        assertEquals(textFile.paste(), "Pasting file fileOne.txt");
    }
}