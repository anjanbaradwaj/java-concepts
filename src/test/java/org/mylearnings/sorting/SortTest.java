package org.mylearnings.sorting;

import com.sun.scenario.effect.Merge;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTest {

    int[] unSortedArr;
    int[] sortedArr;

    @Before
    public void setup() {
        unSortedArr = new int[]{5, 1, 4, 2, 3};
        sortedArr = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void testSelectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(unSortedArr);
        assertArrayEquals(sortedArr, unSortedArr);
    }

    @Test
    public void testBubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(unSortedArr);
        assertArrayEquals(sortedArr, unSortedArr);
    }

    @Test
    public void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(unSortedArr);
        assertArrayEquals(sortedArr, unSortedArr);
    }

    @Test
    public void testMergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergesort(unSortedArr);
        assertArrayEquals(sortedArr, unSortedArr);
    }

    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.sort(unSortedArr, 0, unSortedArr.length - 1);
        assertArrayEquals(sortedArr, unSortedArr);
    }

    @After
    public void tearDown() {
        unSortedArr = null;
        sortedArr = null;
    }
}
