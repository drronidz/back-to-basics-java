package com.cleverdeveloper.gof.behavioral.template_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 3:54 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();

    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addCPU();
        return getComputer();
    }

    public abstract void addCPU();
    public abstract void setupMotherboard();
    public abstract void addMotherboard();

    public List<String> getMotherboardSetupStatus() {
        return motherboardSetupStatus;
    }

    public Map<String, String> getComputerParts() {
        return computerParts;
    }

    private Computer getComputer() {
        return new Computer(computerParts);
    }
}
