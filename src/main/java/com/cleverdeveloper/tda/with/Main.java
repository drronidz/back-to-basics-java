package com.cleverdeveloper.tda.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/5/2022 12:28 AM
*/

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("John","Smith");

        userService.updateTokens(user, Operations.ADD, 1000);
        System.out.println(user);

        userService.updateTokens(user, Operations.SUB, 1100);
        System.out.println(user);
    }
}
