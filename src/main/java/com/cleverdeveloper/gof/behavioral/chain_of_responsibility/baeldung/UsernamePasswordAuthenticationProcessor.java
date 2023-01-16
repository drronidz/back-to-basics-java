package com.cleverdeveloper.gof.behavioral.chain_of_responsibility.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 10:44 PM
*/

public class UsernamePasswordAuthenticationProcessor extends AuthenticationProcessor{

    public UsernamePasswordAuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof UsernamePasswordProvider) return Boolean.TRUE;
        if (nextAuthenticationProcessor != null) return nextAuthenticationProcessor.isAuthorized(authenticationProvider);
        return Boolean.FALSE;
    }
}
