package com.cleverdeveloper.gof.behavioral.chain_of_responsibility.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 10:32 PM
*/

public abstract class AuthenticationProcessor {
    public AuthenticationProcessor nextAuthenticationProcessor;

    public AuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        this.nextAuthenticationProcessor = nextAuthenticationProcessor;
    }

    // standard constructors
    public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);
}
