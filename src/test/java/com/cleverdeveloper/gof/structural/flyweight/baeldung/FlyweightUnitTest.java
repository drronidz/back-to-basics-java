package com.cleverdeveloper.gof.structural.flyweight.baeldung;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 4:16 PM
*/

class FlyweightUnitTest {

    @Test
    void given_different_flyweight_objects_when_equals_then_false() {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

        assertNotNull(blackVehicle, "Object returned by the factory is null!");
        assertNotNull(blueVehicle,  "Object returned by the factory is null!");
        assertNotEquals(blackVehicle, blueVehicle, "Objects returned by the factory are equals!");
    }

    @Test
    void given_same_flyweight_objects_when_equals_then_true() {
        Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle anotherBlackVehicle = VehicleFactory.createVehicle(Color.BLACK);

        assertNotNull(blackVehicle, "Object returned by the factory is null!");
        assertNotNull(anotherBlackVehicle, "Object returned by the factory is null!");
        assertEquals(blackVehicle, anotherBlackVehicle, "Objects returned by the factory are equals!");
    }
}