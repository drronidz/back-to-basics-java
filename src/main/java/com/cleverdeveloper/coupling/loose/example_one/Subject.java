package com.cleverdeveloper.coupling.loose.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 2:24 PM
*/

public class Subject {
    public static void main(String[] args) {

        Topic topicOne = new TopicOne();
        topicOne.understand();

        Topic topicTwo = new TopicTwo();
        topicTwo.understand();
    }
}
