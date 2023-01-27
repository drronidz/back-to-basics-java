package com.cleverdeveloper.tell_dont_ask.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 11:05 PM
*/

import java.util.Random;

public class User {

    private String id;
    private String firstName;
    private String lastName;
    private int tokens;

    public User(String firstName, String lastName) {
        this.generateRandomID();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        StringLengthValidator.greaterThan(firstName, 3);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        StringLengthValidator.greaterThan(lastName, 3);
        this.lastName = lastName;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = NaturalNumberValidator.operation(this.tokens, tokens);
    }

    private void generateRandomID() {
        Random random = new Random();
        this.setId(String.valueOf(random.nextInt(25)));
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", tokens=" + tokens +
                '}';
    }
}
