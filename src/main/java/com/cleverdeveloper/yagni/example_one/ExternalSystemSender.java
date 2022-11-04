package com.cleverdeveloper.yagni.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:27 PM
*/

public abstract class ExternalSystemSender {

    public void send() {
        Records toSend = prepareDataToSend();
        commonMethodToSend(toSend);
    }

    private void commonMethodToSend(Records data) {
        //Sending Logic
    }

    protected abstract Records prepareDataToSend();
}
