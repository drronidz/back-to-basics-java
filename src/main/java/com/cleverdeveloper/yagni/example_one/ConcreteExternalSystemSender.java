package com.cleverdeveloper.yagni.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:31 PM
*/

public class ConcreteExternalSystemSender extends ExternalSystemSender {
    @Override
    protected Records prepareDataToSend() {
        return new Records();
    }
}
