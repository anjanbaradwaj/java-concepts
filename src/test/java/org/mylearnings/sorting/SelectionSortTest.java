package org.mylearnings.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    int [] unSortedArr;
    @Before
    public void setup(){
        unSortedArr = new int[]{5, 1, 4, 2, 3};
    }
    @Test
    public void testSelectionSort(){
        int [] sortedArr = {1,2,3,4,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(unSortedArr);
        assertArrayEquals(sortedArr,unSortedArr);
    }

    @After
    public void tearDown(){
        unSortedArr = null;
    }
}
