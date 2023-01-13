package com.cleverdeveloper.gof.structural.facade.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 3:26 PM
*/

public class FuelInjector {
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        System.out.println("Fuel injector ready to inject fuel.");
    }

    public void inject() {
        fuelPump.pump();
        System.out.println("Fuel injected.");
    }

    public void off() {
        System.out.println("Stopping Fuel injector ...");
    }
}
