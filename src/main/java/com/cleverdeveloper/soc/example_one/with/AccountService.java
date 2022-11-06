package com.cleverdeveloper.soc.example_one.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:58 PM
*/

import java.util.Arrays;

public class AccountService {

    public Object transfer(User fromUser, User toUser, Double amount) {
        if (!UserBalanceValidator.haveEnoughFunds(fromUser, amount)) {
            LoggerService.log(" USER " + fromUser.getId() + " has not enough funds.");
            return Arrays.asList(fromUser, toUser);
        }

        fromUser.setBalance(fromUser.getBalance() - amount);
        toUser.setBalance(toUser.getBalance() + amount);

        return Arrays.asList(fromUser, toUser);
    }

    public User updateBalance(User user, Double amount) {
        user.setBalance(user.getBalance() + amount);
        return  user;
    }

}
