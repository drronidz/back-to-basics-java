package com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:03 AM
*/

import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.Context;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {

    private Predicate<String> filter;

    public Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setFilter(filter);
        return context.search();
    }
}
