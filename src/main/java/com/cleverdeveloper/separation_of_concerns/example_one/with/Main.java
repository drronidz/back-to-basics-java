package com.cleverdeveloper.separation_of_concerns.example_one.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/7/2022 12:03 AM
*/

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        User userOne = new User("John");
        User userTwo = new User("Bob");

        userOne = accountService.updateBalance(userOne, 1000.00);
        userTwo = accountService.updateBalance(userTwo, 500.00);

        System.out.println(accountService.transfer(userOne, userTwo, 250.00));
    }
}
