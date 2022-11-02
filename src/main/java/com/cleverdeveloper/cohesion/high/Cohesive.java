package com.cleverdeveloper.cohesion.high;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 1:21 PM
*/

public class Cohesive {
    public static void main(String[] args) {
        int a = 9;
        int b = 46;
        char c = 'c';
        char o = 'o';

        // Creating an object of the class ArithmeticOperation
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

        // Creating an object of the class CharacterOperation
        CharacterOperation characterOperation = new CharacterOperation();

        arithmeticOperation.addition(a, b);

        characterOperation.findingVowel(c);
        characterOperation.findingVowel(o);
    }
}
