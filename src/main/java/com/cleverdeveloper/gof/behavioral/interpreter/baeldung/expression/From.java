package com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:04 AM
*/

import com.cleverdeveloper.gof.behavioral.interpreter.baeldung.Context;

import java.util.List;

public class From implements Expression {

    private String table;
    private Where where;

    public From(String table) {
        this.table = table;
    }

    public From(String table, Where where) {
        this.table = table;
        this.where = where;
    }

    @Override
    public List<String> interpret(Context context) {
        context.setTable(table);
        if (where == null) {
            return context.search();
        }
        return where.interpret(context);
    }
}
