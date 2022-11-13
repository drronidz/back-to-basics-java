package com.cleverdeveloper.gof.creational.singleton.baeldung;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 11:12 PM
*/

class EnumSingletonTest {

    EnumSingleton enumSingletonOne;
    EnumSingleton enumSingletonTwo;
    EnumSingleton enumSingletonThree;

    @BeforeEach
    void setUp() {
        enumSingletonOne = EnumSingleton.INSTANCE.getInstance();
        enumSingletonTwo = EnumSingleton.INSTANCE.getInstance();
        enumSingletonThree = EnumSingleton.INSTANCE.getInstance();
    }

    @Test
    void when_create_instance_then_only_one_instance_created_by_hashcode() {
        assertEquals(enumSingletonOne.hashCode(), enumSingletonTwo.hashCode());
        assertEquals(enumSingletonTwo.hashCode(), enumSingletonThree.hashCode());
        assertEquals(enumSingletonOne.hashCode(), enumSingletonThree.hashCode());
    }

    @Test
    void when_create_instance_then_only_one_instance_created_by_information() {
        assertEquals(enumSingletonOne.getInformation(), enumSingletonTwo.getInformation());
        assertEquals(enumSingletonTwo.getInformation(), enumSingletonThree.getInformation());
        assertEquals(enumSingletonOne.getInformation(), enumSingletonThree.getInformation());
    }

    @Test
    void when_create_instance_and_update_information_then_create_only_one_instance() {
        enumSingletonOne.setInformation("Information update (1) " + enumSingletonOne.hashCode() + " ... ");
        enumSingletonTwo.setInformation("Information update (2) " + enumSingletonTwo.hashCode() + " ... ");
        assertEquals(enumSingletonOne.getInformation(), enumSingletonTwo.getInformation());
    }
}