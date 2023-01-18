package com.cleverdeveloper.gof.behavioral.iterator.tutorialspoint;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/18/2023 12:59 AM
*/

public class IteratorPatternDriver {
    public static void main(String[] args) {
        CountryRepository countriesRepository = new CountryRepository();

        for(Iterator iter = countriesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
