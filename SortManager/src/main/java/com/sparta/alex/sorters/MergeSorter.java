package com.sparta.alex.sorters;

import java.util.Arrays;

public class MergeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        if (arrayToSort.length == 1) {
            return arrayToSort;
        }
        int[] leftHalf = Arrays.copyOfRange(arrayToSort, 0, arrayToSort.length / 2);
        int[] rightHalf = Arrays.copyOfRange(arrayToSort, arrayToSort.length / 2, arrayToSort.length);
        return merge(sortArray(leftHalf), sortArray(rightHalf));
    }

    public static int[] merge(int[] firstArray, int[] secondArray) {
        int[] resultArray = new int[firstArray.length + secondArray.length];
        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int resultArrayIndex = 0;
        while (firstArrayIndex < firstArray.length && secondArrayIndex < secondArray.length) {
            if (firstArray[firstArrayIndex] < secondArray[secondArrayIndex]) {
                resultArray[resultArrayIndex] = firstArray[firstArrayIndex];
                firstArrayIndex++;
            } else {
                resultArray[resultArrayIndex] = secondArray[secondArrayIndex];
                secondArrayIndex++;
            }
            resultArrayIndex++;
        }
        if (firstArrayIndex == firstArray.length) {
            for(int i = secondArrayIndex; i < secondArray.length; i++) {
                resultArray[resultArrayIndex] = secondArray[i];
                resultArrayIndex++;
            }
        } else {
            for(int i = firstArrayIndex; i < firstArray.length; i++) {
                resultArray[resultArrayIndex] = firstArray[i];
                resultArrayIndex++;
            }
        }
        return resultArray;
    }
}
