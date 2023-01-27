package com.cleverdeveloper.tell_dont_ask.without;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 11:07 PM
*/

import java.util.Random;

public class UserService {

    public User register(String firstName, String lastName) {
        if (firstName.length() < 3) {
            throw new Error("Name is not long enough.");
        }
        if (lastName.length() < 3) {
            throw new Error("Name is not log enough");
        }

        User user = new User();
        Random random = new Random();
        user.setId(String.valueOf(random.nextInt(25)));
        user.setFirstName(firstName.toLowerCase());
        user.setLastName(lastName.toLowerCase());

        return user;
    }

    public User updateTokens(User user, String operation, Integer amount) {
        if (operation == "add") user.setTokens(user.getTokens() + amount);
        if (operation == "sub") {
            if (user.getTokens() - amount >= 0) user.setTokens(user.getTokens() - amount);
            else user.setTokens(0);
        }
        return user;
    }
}
