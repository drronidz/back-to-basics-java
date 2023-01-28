package com.cleverdeveloper.functional_interfaces.basic;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/28/2023 3:57 PM
*/

public class FunctionalInterfaceDriver implements A {
    @Override
    public void methodOne() {
        System.out.println("This is the execution of methodOne() [Without Lambda] ...");
    }

    public static void main(String[] args) {

        A aWithoutLambda = new FunctionalInterfaceDriver();

        System.out.println("############# Without Lambda #############");
        // Without Lambda expression :
        aWithoutLambda.methodOne();

        System.out.println("############# With Lambda #############");
        // With Lambda expression :
        A aWithLambda = () -> System.out.println("methodOne() is executing [With Lambda] ...");
        aWithLambda.methodOne();

    }
}
