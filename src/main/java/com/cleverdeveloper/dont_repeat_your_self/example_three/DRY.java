package com.cleverdeveloper.dont_repeat_your_self.example_three;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:55 AM
*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

public class DRY {
    private static final String filepath = "C:\\Users\\DRRONIDZ\\Desktop";

    public static void main(String[] args) throws ParseException, IOException {

        Report report = new Report(
                1,
                "RICAMAR",
                "TUNA",
                "11/11/2022",
                "11/11/2027",
                560000);

        report.show();

        DRY dry = new DRY();

        dry.saveToFile(report);

    }

    public void saveToFile(Object file) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(filepath);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(file);
        objectOut.close();
        System.out.println("The Object  was successfully written to a file");
    }
}
