package com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/17/2023 11:42 PM
*/

import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.Context;

import java.util.List;

public interface Expression {
    List<String> interpret(Context context);
}
