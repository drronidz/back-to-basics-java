package com.cleverdeveloper.gof.behavioral.mediator.baeldung;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:41 AM
*/

class MediatorIntegrationTest {

    private Button button;
    private Fan fan;

    @BeforeEach
    void setUp() {
        this.button = new Button();
        this.fan = new Fan();
        PowerSupply powerSupply = new PowerSupply();
        Mediator mediator = new Mediator();

        mediator.setButton(this.button);
        mediator.setFan(fan);
        mediator.setPowerSupply(powerSupply);
    }

    @Test
    void given_turnedOffFan_when_pressing_Button_twice_fan_should_turn_on_and_off() {
        assertFalse(fan.isOn());

        button.press();
        assertTrue(fan.isOn());

        button.press();
        assertFalse(fan.isOn());
    }
}