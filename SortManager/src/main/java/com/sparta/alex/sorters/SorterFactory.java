package com.sparta.alex.sorters;

public class SorterFactory {

    public static Sorter createSorter(SorterTypes sorterType) {
        if (sorterType == SorterTypes.BUBBLE) {
            return new BubbleSorter();
        }
        if (sorterType == SorterTypes.MERGE) {
            return new BubbleSorter();
        }
        if (sorterType == SorterTypes.BINARY_TREE) {
            return new BinaryTreeSorter();
        }
        return null;
    }
}
