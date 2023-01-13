package com.cleverdeveloper.gof.structural.facade.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 3:23 PM
*/

public class Radiator {

    public void on() {
        System.out.println(Radiator.class.getSimpleName() + " switched on!");
    }

    public void off() {
        System.out.println(Radiator.class.getSimpleName() + " switched off!");
    }

    public void setSpeed(Integer fanSpeed) {
        System.out.println("Setting radiator fan speed to " + fanSpeed);
    }
}
