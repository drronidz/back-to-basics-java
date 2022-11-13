package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.read_resolve;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 4:29 PM
*/

import java.io.*;

public class Main {
    static Singleton instanceOne = Singleton.getInstance();

    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput output = new ObjectOutputStream(new FileOutputStream("read_resolve.ser"));
            output.writeObject(instanceOne);
            output.close();

            instanceOne.setI(20);

            // Serialize to a file
            ObjectInput input = new ObjectInputStream(new FileInputStream("read_resolve.ser"));
            Singleton instanceTwo = (Singleton) input.readObject();
            input.close();

            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
