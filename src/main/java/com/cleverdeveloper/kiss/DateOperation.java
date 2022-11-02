package com.cleverdeveloper.kiss;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 1:46 PM
*/

import org.w3c.dom.ls.LSOutput;

public class DateOperation {

    public String weekDayWithoutKISS(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "day must be in range 1 to 7";
        }
    }

    public String weekDayWithKISS(int day) {

        if ((day < 1) || (day > 7)) return "day must be in range 1 to 7";

        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        return days[day - 1];
    }
}
