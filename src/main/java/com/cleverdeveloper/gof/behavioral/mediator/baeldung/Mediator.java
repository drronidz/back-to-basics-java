package com.cleverdeveloper.gof.behavioral.mediator.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:30 AM
*/

public class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupply powerSupply;

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void press() {
        if (fan.isOn()) { fan.turnOff(); }
        else { fan.turnOn(); }
    }

    public void start() {
        powerSupply.turnOn();
    }

    public void stop() {
        powerSupply.turnOff();
    }
}
