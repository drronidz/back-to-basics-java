package com.cleverdeveloper.gof.behavioral.observer.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 11:50 PM
*/

import java.util.Observable;

public class ObservableNewsAgency extends Observable {

    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
