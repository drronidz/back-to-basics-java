package com.cleverdeveloper.functional_interfaces.supplier;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/3/2023 3:48 PM
*/

import java.util.Date;

public class Trade {
    private String id;
    private Date date;
    private String location;

    public Trade(String id, Date date, String location) {
        this.id = id;
        this.date = date;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                '}';
    }
}
