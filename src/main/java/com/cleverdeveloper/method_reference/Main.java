package com.cleverdeveloper.method_reference;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/17/2023 3:02 PM
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Using Lambda Expression */
        A aOne = x -> { return x > -10 && x > 10 ; };
        System.out.println(aOne.isSingleDigit(10));

        /* Using Method Reference */
        A aTwo = Digit::isSingleDigit;
        System.out.println(aTwo.isSingleDigit(9));


        // Testing Instance Method Reference
        System.out.println("#################### Testing Instance Method Reference ####################");
        Addition addition = new Addition();

        /* Using Lambda Expression */
        B bOne = (a,b) -> System.out.println("Sum is : " + ( a + b ));
        bOne.add(10, 15);

        /* Using Method Reference */
        B bTwo = addition::sum;
        bTwo.add(15,25);

        // Constructor Reference
        System.out.println("#################### Constructor Reference ####################");

        /* Using Lambda Expression */
        C cOne = () -> new Employee();
        cOne.getEmployee().getEmployeeInfo();
        D dOne = (name, age) -> new Employee(name, age);
        dOne.getEmployee("Tony", 34).getEmployeeInfo();

        /* Using Method Reference */
        C cTwo = Employee::new;
        cTwo.getEmployee().getEmployeeInfo();
        D dTwo = Employee::new;
        dTwo.getEmployee("Tony", 34).getEmployeeInfo();

        // Testing Arbitrary Object Method Reference
        System.out.println("#################### Testing Arbitrary Object Method Reference ####################");

        List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);

        /* Using Anonymous Inner class*/
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer integerOne, Integer integerTwo) {
                return integerOne.compareTo(integerTwo);
            }
        });

        /* Using Anonymous Inner class */
        numbers.forEach(System.out::println);

        /* Using Lambda Expression*/
        Collections.sort(numbers, (integerOne, integerTwo) -> integerOne.compareTo(integerTwo));
        numbers.forEach(System.out::println);

        /* Using Method Reference */
        Collections.sort(numbers, (Integer::compareTo));
        numbers.forEach(System.out::println);
    }
}
