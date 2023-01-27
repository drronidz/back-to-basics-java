package com.cleverdeveloper.separation_of_concerns.example_one.without;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:11 PM
*/

import java.util.Arrays;
import java.util.Date;

public class AccountService {

    public void log(String message) {
        System.out.println(new Date() + " :: " + message);
    }

    public Object transfer(final User userOne, final User userTwo, Double amount) {
        // validate amount
        if (amount <= 0) {
            this.log("amount 0, nothing changed!");
            return Arrays.asList(userOne, userTwo);
        }

        // validate if userOne have enough
        if ((userOne.getBalance() - amount) < 0) {
            this.log(" USER " + userOne.getId() + " did not have enough funds.");
            return Arrays.asList(userOne, userTwo);
        }

        // debit from userOne
        userOne.setBalance(userOne.getBalance() - amount);
        // add to userTwo
        userTwo.setBalance(userTwo.getBalance() + amount);

        this.log(" User n° " + userOne.getId() + " now has " + userOne.getBalance());
        this.log(" User n° " + userTwo.getId() + " now has " + userTwo.getBalance());

        return Arrays.asList(userOne, userTwo);
    }

    public User updateBalance(User user, Double amount) {
        user.setBalance(user.getBalance() + amount);
        this.log(" USER " + user.getId() + " now has " + user.getBalance());
        return user;
    }
}
