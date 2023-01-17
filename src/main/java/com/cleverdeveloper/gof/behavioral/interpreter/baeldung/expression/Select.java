package com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/17/2023 11:43 PM
*/

import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.Context;

import java.util.List;

public class Select implements Expression{
    private String column;
    private From from;

    public Select(String column, From from) {
        this.column = column;
        this.from = from;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setColumn(column);
        return from.interpret(context);
    }
}
