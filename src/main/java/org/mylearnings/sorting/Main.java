package org.mylearnings.sorting;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 6, 11, 3, 5, 2};
        printArray("Input Array", arr);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        printArray("SelectionSort", arr);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        printArray("BubbleSort", arr);

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        printArray("InsertionSort", arr);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergesort(arr);
        printArray("MergeSort", arr);

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        printArray("QuickSort", arr);

    }

    public static void printArray(String type, int[] arr) {
        System.out.println(" ---------- ");
        System.out.println(" " + type + " : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(" ---------- ");
    }
}
