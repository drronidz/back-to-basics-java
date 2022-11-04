package com.cleverdeveloper.encapsulation.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 9:58 PM
*/

public class Main {
    public static void main(String[] args) {

        Area rectangle = new Area(2, 16);
        rectangle.getArea();

        Encapsulate encapsulate = new Encapsulate();

        encapsulate.setGeekName("Harsh");
        encapsulate.setGeekAge(19);
        encapsulate.setGeekRole(51);

        System.out.println("Geek's name: " + encapsulate.getGeekName());
        System.out.println("Geek's age: " + encapsulate.getGeekAge());
        System.out.println("Geek's roll: " + encapsulate.getGeekRole());
    }
}
