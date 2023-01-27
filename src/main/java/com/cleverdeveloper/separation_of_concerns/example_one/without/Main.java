package com.cleverdeveloper.separation_of_concerns.example_one.without;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:37 PM
*/

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        User userOne = new User("John");
        accountService.updateBalance(userOne, 1000.00);

        User userTwo = new User("Bob");
        accountService.updateBalance(userTwo, 500.00);

        System.out.println(accountService.transfer(userOne, userTwo, 250.00));
    }
}
