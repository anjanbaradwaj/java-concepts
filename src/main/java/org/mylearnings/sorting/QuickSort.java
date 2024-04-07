package org.mylearnings.sorting;

public class QuickSort {

    public void sort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];//4
        int i = low - 1;//-1
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;//0
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;

        return i + 1;
    }
}
