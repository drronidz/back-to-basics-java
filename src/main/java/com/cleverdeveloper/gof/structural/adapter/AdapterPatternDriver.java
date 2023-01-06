package com.cleverdeveloper.gof.structural.adapter;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2023 3:07 PM
*/

public class AdapterPatternDriver {
    public static void main(String[] args) {

        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Bugatti Veyron Super Sport's top speed is " + bugattiVeyronAdapter.getSpeed() + "KMPH.");

        Movable mcLaren = new McLaren();
        MovableAdapter mcLarenAdapter = new MovableAdapterImpl(mcLaren);
        System.out.println("McLaren F1 top speed is " + mcLarenAdapter.getSpeed() + "KMPH.");

        Movable astonMartin = new AstonMartin();
        MovableAdapter astonMartinAdapter = new MovableAdapterImpl(astonMartin);
        System.out.println("McLaren F1 top speed is " + astonMartinAdapter.getSpeed() + " Kmph.");
    }
}
