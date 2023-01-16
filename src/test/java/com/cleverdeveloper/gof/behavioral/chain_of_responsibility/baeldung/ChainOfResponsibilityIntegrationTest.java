package com.cleverdeveloper.gof.behavioral.chain_of_responsibility.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/16/2023 10:47 PM
*/

class ChainOfResponsibilityIntegrationTest {
    
    private static AuthenticationProcessor getChainOfAuthenticationProcessor() {
        AuthenticationProcessor oAuthProcessor = new OAuthAuthenticationProcessor(null);
        AuthenticationProcessor usernamePasswordProcessor = new UsernamePasswordAuthenticationProcessor(oAuthProcessor);
        return usernamePasswordProcessor;
    }

    @Test
    void given_OAuthProvider_when_checking_authorized_then_success() {
        AuthenticationProcessor authenticationProcessorChain = getChainOfAuthenticationProcessor();
        boolean isAuthorized = authenticationProcessorChain.isAuthorized(new OAuthTokenProvider());
        assertTrue(isAuthorized);
    }

    @Test
    void given_UsernamePasswordProvider_when_checking_authorized_then_success() {
        AuthenticationProcessor authenticationProcessorChain = getChainOfAuthenticationProcessor();
        boolean isAuthorized = authenticationProcessorChain.isAuthorized(new UsernamePasswordProvider());
        assertTrue(isAuthorized);
    }

    @Test
    void given_SAMPLAuthProvider_when_checking_Authorized_then_failure() {
        AuthenticationProcessor authenticationProcessorChain = getChainOfAuthenticationProcessor();
        boolean isAuthorized = authenticationProcessorChain.isAuthorized(new SAMLAuthenticationProvider());
        assertTrue(!isAuthorized);
    }
}