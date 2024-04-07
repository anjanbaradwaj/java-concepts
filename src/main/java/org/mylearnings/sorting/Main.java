package org.mylearnings.sorting;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int [] arr = {4,7,1,6,11,3,5,2};
        selectionSort.sort(arr);
        printArray(arr);
    }

    public static void printArray(int [] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
