package com.cleverdeveloper.soc.example_one.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:53 PM
*/


public class UserBalanceValidator {
    public static boolean haveEnoughFunds(User user, Double amount) {
        return (user.getBalance() - amount) > 0;
    }
}
