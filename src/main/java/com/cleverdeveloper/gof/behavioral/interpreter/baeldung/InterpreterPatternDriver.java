package com.cleverdeveloper.gof.behavioral.interpreter.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/17/2023 11:40 PM
*/

import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression.Expression;
import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression.From;
import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression.Select;
import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression.Where;

import java.util.List;

public class InterpreterPatternDriver {
    public static void main(String[] args) {

        Expression queryOne = new Select("firstName", new From("people"));
        Context context = new Context();
        List<String> resultOne = queryOne.interpret(context);
        System.out.println(resultOne);

        Expression queryTwo = new Select("*", new From("people"));
        List<String> resultTwo = queryTwo.interpret(context);
        System.out.println(resultTwo);

        Expression queryThree = new Select("firstName", new From("people", new Where(firstName -> firstName.toLowerCase().startsWith("d"))));
        List<String> resultThree = queryThree.interpret(context);
        System.out.println(resultThree);
    }
}
