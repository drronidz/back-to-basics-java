package com.cleverdeveloper.coupling.tight.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 2:18 PM
*/

public class Subject {
    Topic topic = new Topic();

    public void startReading() {
        topic.understand();
    }
}
