package org.mylearnings.generics;

public class GenericPrinter {
    public <T> void printContent(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
