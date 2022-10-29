package com.cleverdeveloper.dry.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:25 AM
*/

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Cat implements Animal{
    @Override
    public void speaks() {
        System.out.println(colorize(" Meow! *purrs* ",
                Attribute.BOLD(),
                Attribute.TEXT_COLOR(120),
                Attribute.BACK_COLOR(200)));
    }
}
