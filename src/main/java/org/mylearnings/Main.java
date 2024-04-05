package org.mylearnings;

import org.mylearnings.generics.Calculator;
import org.mylearnings.generics.GenericPrinter;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Print the contents of any type of array in a new line
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"Hello", "world"};
        GenericPrinter generic = new GenericPrinter();
        generic.printContent(intArr);
        generic.printContent(strArr);
        generic.printContent(Stream.of("This", "is", "just", "another", "sentence").toArray());

        //Add 2 numbers of any type, if no numbers are passed, the method should return 0
        Integer a = 5;
        Integer b = 7;
        Calculator cal = new Calculator();
        Integer sum = cal.add(a, b);
        System.out.println(sum);
    }
}