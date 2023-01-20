package com.cleverdeveloper.gof.behavioral.observer.baeldung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 11:58 PM
*/

class ObserverIntegrationTest {
    @Test
    void when_changing_newsAgency_state_then_NewsChannel_notified() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.addObserver(observer);

        observable.setNews("MAN UTD 1-1 CRYSTAL PALACE (FULL TIME)");

        assertEquals(observer.getNews(), "MAN UTD 1-1 CRYSTAL PALACE (FULL TIME)");
    }

    @Test
    void when_changing_ObservableNewsAgency_state_then_ObserverNewsChannel_notified() {
        ObservableNewsAgency observable = new ObservableNewsAgency();
        ObserverNewsChannel observer = new ObserverNewsChannel();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}