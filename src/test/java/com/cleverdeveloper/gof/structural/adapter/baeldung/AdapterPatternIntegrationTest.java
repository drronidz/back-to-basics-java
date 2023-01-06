package com.cleverdeveloper.gof.structural.adapter.baeldung;

import com.cleverdeveloper.gof.structural.adapter.baeldung.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2023 3:14 PM
*/

class AdapterPatternIntegrationTest {
    @Test
    public void givenMovableAdapter_WhenConvertingMPHtoKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);

        Movable mcLaren = new McLaren();
        MovableAdapter mcLarenAdapter = new MovableAdapterImpl(mcLaren);
        assertEquals(mcLarenAdapter.getSpeed(), 387.85094, 0.00001);

        Movable astonMartin = new AstonMartin();
        MovableAdapter astonMartinAdapter = new MovableAdapterImpl(astonMartin);
        assertEquals(astonMartinAdapter.getSpeed(), 354.0548, 0.00001);
    }
}