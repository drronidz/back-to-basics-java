package com.cleverdeveloper.gof.behavioral.state.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:50 PM
*/

class StatePatternUnitTest {

    @Test
    void given_new_Package_when_Package_received_then_set_state_received() {
        Package pack = new Package();

        assertTrue(pack.getState() instanceof OrderedState);
        pack.nextState();

        assertTrue(pack.getState() instanceof DeliveredState);
        pack.nextState();

        assertTrue(pack.getState() instanceof ReceivedState);
    }

    @Test
    void given_delivered_package_when_previous_state_then_set_state_ordered() {
        Package pack = new Package();
        pack.setState(new DeliveredState());
        pack.previousState();

        assertTrue(pack.getState() instanceof OrderedState);
    }
}