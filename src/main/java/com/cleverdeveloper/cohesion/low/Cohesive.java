package com.cleverdeveloper.cohesion.low;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 1:07 PM
*/

public class Cohesive {

    // Method for adding two numbers ...
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println(" The sum of " + a + " & " + b + " is : " + sum + " ");
    }

    // Method for checking the vowels in
    public void findingVowel(char character) {
        switch (character) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println(character + " is a vowel.");
                break;
            default:
                System.out.println(character + " is not a vowel.");
        }
    }

    public static void main(String[] args) {

        Cohesive cohesive = new Cohesive();

        cohesive.addition(5, 70);

        cohesive.findingVowel('t');
        cohesive.findingVowel('o');
    }
}
