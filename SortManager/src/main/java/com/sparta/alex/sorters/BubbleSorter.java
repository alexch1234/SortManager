package com.sparta.alex.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        for(int i = arrayToSort.length - 1; i > 0; i--) {
            boolean isSorted = true;
            for (int j = 0; j <  i; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return arrayToSort;
    }
}
