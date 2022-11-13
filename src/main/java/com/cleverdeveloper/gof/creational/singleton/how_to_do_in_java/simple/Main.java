package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.simple;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 2:55 PM
*/

public class Main {
    public static void main(String[] args) {

        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        Singleton instanceThree = Singleton.getInstance();

        System.out.println("Hash code of instanceOne is : " + instanceOne.hashCode());
        System.out.println("Hash code of instanceTwo is : " + instanceTwo.hashCode());
        System.out.println("Hash code of instanceThree is : " + instanceThree.hashCode());

        // Comparing objects ...
        System.out.println(compareObject(instanceOne, instanceTwo));
        System.out.println(compareObject(instanceTwo, instanceThree));
    }

    public static String compareObject(Object instanceOne, Object instanceTwo) {
        return instanceOne == instanceTwo ? "Objects are equal" : "Objects are not equal";
    }
}
