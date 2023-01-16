package com.cleverdeveloper.gof.behavioral.chain_of_responsibility.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 10:34 PM
*/

public class OAuthAuthenticationProcessor extends AuthenticationProcessor {
    public OAuthAuthenticationProcessor(AuthenticationProcessor nextAuthenticationProcessor) {
        super(nextAuthenticationProcessor);
    }

    @Override
    public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof OAuthTokenProvider) return Boolean.TRUE;
        if (nextAuthenticationProcessor != null) return nextAuthenticationProcessor.isAuthorized(authenticationProvider);
        return Boolean.FALSE;
    }
}
