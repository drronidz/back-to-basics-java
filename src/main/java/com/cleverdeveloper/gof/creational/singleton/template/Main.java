package com.cleverdeveloper.gof.creational.singleton.template;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 10:04 PM
*/

public class Main {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        Singleton instanceThree = Singleton.getInstance();

        System.out.println("Hash code of instanceOne   is : " + instanceOne.hashCode());
        System.out.println("Hash code of instanceTwo   is : " + instanceTwo.hashCode());
        System.out.println("Hash code of instanceThree is : " + instanceThree.hashCode());
    }
}
