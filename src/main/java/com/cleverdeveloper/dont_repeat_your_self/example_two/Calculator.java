package com.cleverdeveloper.dont_repeat_your_self.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:45 AM
*/

public class Calculator {

    public int total(int a, int b) {
        int sum = a + b;
        System.out.println("Total = " + sum);
        return sum;
    }

    public double average(int a, int b) {
        int average = total(a,b) / 2;
        System.out.println("Average = " + average);
        return average;
    }

}
