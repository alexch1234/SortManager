package com.sparta.alex;

import com.sparta.alex.sorters.MergeSorter;
import com.sparta.alex.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSorterTests {

    @Test
    public void mergeShouldReturnSortedArray() {
        Sorter mergeSorter = new MergeSorter();
        Assertions.assertArrayEquals(new int[]{4,8,15,16,23,42}, mergeSorter.sortArray(new int[]{16,42,4,23,8,15}));
    }

    @Test
    public void mergeShouldReturnNumber() {
        Sorter mergeSorter = new MergeSorter();
        Assertions.assertArrayEquals(new int[]{1}, mergeSorter.sortArray(new int[]{1}));
    }
}
