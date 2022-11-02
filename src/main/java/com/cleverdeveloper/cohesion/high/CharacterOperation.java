package com.cleverdeveloper.cohesion.high;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 1:21 PM
*/

public class CharacterOperation {
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
}
