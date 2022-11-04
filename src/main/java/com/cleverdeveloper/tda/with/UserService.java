package com.cleverdeveloper.tda.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/5/2022 12:38 AM
*/

public class UserService {

    public User register (String firstName, String lastName) {
        User user = null;
        try {
            user = new User(firstName, lastName);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return user;
    }

    public User updateTokens(User user, Operations operation, Integer amount) {
        if (operation == Operations.SUB) {
            amount *= -1;
        }
        user.setTokens(amount);
        return user;
    }
}
