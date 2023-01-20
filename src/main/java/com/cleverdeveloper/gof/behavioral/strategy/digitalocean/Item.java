package com.cleverdeveloper.gof.behavioral.strategy.digitalocean;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 3:13 PM
*/

public class Item {

    private String bareCode;
    private int price;

    public Item(String bareCode, int price) {
        this.bareCode = bareCode;
        this.price = price;
    }

    public String getBareCode() {
        return bareCode;
    }

    public int getPrice() {
        return price;
    }
}
