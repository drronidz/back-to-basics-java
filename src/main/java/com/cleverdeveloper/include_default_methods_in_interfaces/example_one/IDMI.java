package com.cleverdeveloper.include_default_methods_in_interfaces.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 12:09 AM
*/

public class IDMI {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");

        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
    }
}
