package com.cleverdeveloper.gof.creational.prototype.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:23 PM
*/

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public static class ModelType {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "album";
    }

    private static Map<String, PrototypeCapable> prototypes = new HashMap<>();

    static {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return prototypes.get(s).clone();
    }
}
