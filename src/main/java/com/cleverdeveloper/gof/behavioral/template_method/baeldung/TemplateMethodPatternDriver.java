package com.cleverdeveloper.gof.behavioral.template_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/21/2023 4:05 PM
*/

public class TemplateMethodPatternDriver {
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts()
                .forEach((part,end) -> System.out.println("Part : " + part + " End : " + end));

        System.out.println("#####################################################");
        ComputerBuilder highEndComputerBuilder= new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts()
                .forEach((part,end) -> System.out.println("Part : " + part + " End : " + end));
    }
}
