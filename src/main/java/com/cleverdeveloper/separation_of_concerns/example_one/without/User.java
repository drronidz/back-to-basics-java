package com.cleverdeveloper.separation_of_concerns.example_one.without;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:08 PM
*/

import com.cleverdeveloper.separation_of_concerns.example_one.with.LoggerService;
import com.cleverdeveloper.separation_of_concerns.example_one.with.StringLengthValidator;

public class User {
    private String id;
    private String name;
    private Double balance;

    public User(String name) {
        this.id = this.generateRandomID();
        this.name = name;
        this.balance = 0.00;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        StringLengthValidator.greaterThan(name, 2);
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
        LoggerService.log("USER " + this.getId() + " now has " + this.getBalance());
    }

    public String generateRandomID() {
        return String.valueOf(Math.random());
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
