package com.cleverdeveloper.gof.behavioral.template_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 4:03 PM
*/

public class StandardComputerBuilder extends ComputerBuilder  {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add("Plugging in the PSU connectors");
        motherboardSetupStatus.forEach(step -> System.out.println(step));
    }

    @Override
    public void addCPU() {
        computerParts.put("CPU", "Standard CPU");
    }


}
