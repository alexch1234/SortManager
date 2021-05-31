package com.sparta.alex;

import com.sparta.alex.sorters.BinaryTreeSorter;
import com.sparta.alex.sorters.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeSorterTests {

    @Test
    public void shouldReturnSortedArray() {
        Sorter binaryTreeSorter = new BinaryTreeSorter();
        Assertions.assertArrayEquals(new int[]{4,8,15,16,23,42}, binaryTreeSorter.sortArray(new int[]{15,4,16,42,8,23}));
    }

    @Test
    public void shouldReturnNumber() {
        Sorter binaryTreeSorter = new BinaryTreeSorter();
        Assertions.assertArrayEquals(new int[]{1}, binaryTreeSorter.sortArray(new int[]{1}));
    }
}
