package com.cleverdeveloper.functional_interfaces.consumer;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 10:58 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDriver {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"John Doe",2000.00));
        employees.add(new Employee(2,"Jane Thompson",2000.00));
        employees.add(new Employee(3,"Carl Miler",2000.00));
        //employees.add(null);

        Consumer<Employee> printOnConsole = employee -> { System.out.println(employee);} ;
        Consumer<Employee> storeInDB = employee -> { System.out.println(employee + " stored in DB !"); };

        System.out.println("############### Printing Employees on console ###############");
        forEach(employees, printOnConsole);

        System.out.println("############### Storing Employees in DB ###############");
        forEach(employees, storeInDB);

        System.out.println("############### Printing Employees on console && Storing Employees in DB ###############");
        forEach(employees, printOnConsole.andThen(storeInDB));

    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
        int count = 0;
        for (T t: list) {
            if (t != null) {
                consumer.accept(t);
            } else {
                count++;
            }
        }
        System.out.printf("%d null entries found in the list.\n", count);
    }
}
