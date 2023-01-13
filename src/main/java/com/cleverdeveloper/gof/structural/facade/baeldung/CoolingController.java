package com.cleverdeveloper.gof.structural.facade.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 3:29 PM
*/

public class CoolingController {
    private static final Integer DEFAULT_RADIATOR_FAN_SPEED = 10;

    private Integer temperatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
        System.out.println("Setting temperature upper limit to " + temperatureUpperLimit);
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run() {
        System.out.println("Cooling Controller ready!");
    }

    public void cool(Integer maxAllowedTemp) {
        System.out.println("Scheduled cooling with maximum allowed temperature " + maxAllowedTemp);
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        System.out.println("Stopping Cooling Controller ...");
        radiator.off();
    }
}
