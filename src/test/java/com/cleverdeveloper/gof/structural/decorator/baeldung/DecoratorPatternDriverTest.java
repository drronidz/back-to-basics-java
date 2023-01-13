package com.cleverdeveloper.gof.structural.decorator.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 3:01 PM
*/

class DecoratorPatternDriverTest {

    @Test
    void whenDecoratorInjectedAtRuntime_theConfigSuccess() {
        ChristmasTree treeOne = new Garland(new ChristmasTreeImpl());
        assertEquals(treeOne.decorate(), "Christmas tree with Garland");

        ChristmasTree treeTwo = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(treeTwo.decorate(),"Christmas tree with Garland with Garland with Bubble Lights");
    }
}