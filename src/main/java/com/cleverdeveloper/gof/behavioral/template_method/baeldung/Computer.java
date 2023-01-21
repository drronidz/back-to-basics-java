package com.cleverdeveloper.gof.behavioral.template_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:53 PM
*/

import java.util.HashMap;
import java.util.Map;

public class Computer {

    private Map<String, String> computerParts = new HashMap<>();

    public Computer(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }

    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}
