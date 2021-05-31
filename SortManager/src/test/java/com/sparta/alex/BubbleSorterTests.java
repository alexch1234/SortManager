package com.sparta.alex;

import com.sparta.alex.sorters.BubbleSorter;
import com.sparta.alex.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSorterTests {

    @Test
    public void bubbleShouldReturnSortedArray() {
        Sorter bubbleSorter = new BubbleSorter();
        Assertions.assertArrayEquals(new int[]{4,8,15,16,23,42}, bubbleSorter.sortArray(new int[]{15,4,16,42,8,23}));
    }

    @Test
    public void bubbleShouldReturnNumber() {
        Sorter bubbleSorter = new BubbleSorter();
        Assertions.assertArrayEquals(new int[]{1}, bubbleSorter.sortArray(new int[]{1}));
    }
}
