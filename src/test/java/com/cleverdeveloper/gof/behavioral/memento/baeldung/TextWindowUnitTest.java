package com.cleverdeveloper.gof.behavioral.memento.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 11:30 PM
*/

class TextWindowUnitTest {

    @Test
    void givenTextEditor_when_add_text_add_more_and_undo_then_save_state_restored() {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.hitUndo();

        assertEquals(textEditor.print(),"The memento Design Pattern\nHow to implement it in Java?\n");
    }
}