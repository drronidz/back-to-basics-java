package com.cleverdeveloper.dont_repeat_your_self.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:25 AM
*/

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Dog implements Animal{

    @Override
    public void speaks() {
        System.out.println(colorize(" Woof! *wags tail* ",
                Attribute.BOLD(),
                Attribute.TEXT_COLOR(125),
                Attribute.BACK_COLOR(255)));
    }
}
