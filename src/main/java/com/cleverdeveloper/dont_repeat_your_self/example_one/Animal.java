package com.cleverdeveloper.dont_repeat_your_self.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:15 AM
*/

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public interface Animal {

    /*
    * we could implement eats() as a default method : starting from JDK 8 onward
    * */

    public default void eats() {
        System.out.println(colorize("##### Eating food ... #####",
                Attribute.BOLD(),
                Attribute.BLACK_TEXT(),
                Attribute.YELLOW_BACK()));
    }

    public void speaks();
}
