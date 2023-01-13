package com.cleverdeveloper.gof.structural.facade.baeldung;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 3:49 PM
*/

class FacadePatternDriverIntegrationTest {

    private StringBuilder appender;

    @BeforeEach
    void setUp() {
        appender = new StringBuilder();
    }

    @AfterEach
    void tearDown() {
        appender.setLength(0);
    }

    @Test
    void whenStartEngine_then_AllNecessaryActionsPerformed() {
        FacadePatternDriver carEngineFacade = new FacadePatternDriver();
        carEngineFacade.startEngine();
//        assertEquals();
    }
}