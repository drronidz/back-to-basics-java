package com.cleverdeveloper.lambda_expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/10/2023 4:03 PM
*/

public class LambdaDriver {

    public static void main(String[] args) {

    }
    /* Simple Java Method (old school way ...)*/
//    private void add (int a, int b) {
//        System.out.println(a+b);
//    }

    /* Step 01: remove the access modifier */
//    void add(int a, int b) {
//        System.out.println(a+b);
//    }

    /* Step 02:  remove the return type */
//    add(int a, int b) {
//        System.out.println(a+b);
//    }
    /* Step 03:  remove the return type */
//    (int a, int b) {
//        System.out.println(a+b);
//    }

    /* Step 04:  insert arrow sign (->) between remaining method declaration & body */
//     (int a, int b) -> { System.out.println(a+b); }

    /* Step 04:  If compiler is able to identify the type of parameters, remove them as well */
//    (a,b) -> { System.out.println(a+b); }

    /* Given below is a method to print “Hello Java 8” on the console*/
    public void helloWorld() {
        System.out.println("Hello World from Java 8");
    }
//    () -> {
//        System.out.println("Hello World from Java 8");
//    }
}
