package com.cleverdeveloper.gof.creational.singleton.baeldung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 10:44 PM
*/

class ClassSingletonTest {

    ClassSingleton classSingletonOne;
    ClassSingleton classSingletonTwo;
    ClassSingleton classSingletonThree;

    @BeforeEach
    void setUp() {
        classSingletonOne = ClassSingleton.getInstance();
        classSingletonTwo = ClassSingleton.getInstance();
        classSingletonThree = ClassSingleton.getInstance();
    }

    @Test
    void when_create_instance_then_only_one_instance_created_by_hashcode() {
        assertEquals(classSingletonOne.hashCode(), classSingletonTwo.hashCode());
        assertEquals(classSingletonTwo.hashCode(), classSingletonThree.hashCode());
    }

    @Test
    void when_create_instance_then_only_one_instance_created_by_information() {
        //The constructor is private
        //ClassSingleton classSingleton = new ClassSingleton();
        assertEquals(classSingletonOne.getInformation(), classSingletonTwo.getInformation());
    }

    @Test
    void when_create_instance_and_update_information_then_create_only_one_instance() {
        classSingletonOne.setInformation("Information update " + classSingletonOne.hashCode() + "...");
        classSingletonTwo.setInformation("Information update " + classSingletonTwo.hashCode() + "...");
        assertEquals(classSingletonOne.getInformation(), classSingletonTwo.getInformation());
    }
}