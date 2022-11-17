package com.cleverdeveloper.gof.creational.builder;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/15/2022 11:48 PM
*/

 public class BuilderPatternDriver {

    public static void main(String[] args) {
        BankAccount newBankAccount = new BankAccount
                .BankAccountBuilder("John", "2587965478")
                .withEmail("john.doe@example.com")
                .wantNewsLetter(true)
                .build();

        System.out.println(newBankAccount);
        /* BankAccount [
        name='John',
        accountNumber='2587965478',
        email='john.doe@example.com',
        newsletter=true ] */
    }
 }


