package com.cleverdeveloper.tell_dont_ask.without;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 11:28 PM
*/

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        User user = userService.register("John", "Smith");

        userService.updateTokens(user, "add", 1000);
        System.out.println(user);

        userService.updateTokens(user, "sub", 1100);
        System.out.println(user);
    }
}
