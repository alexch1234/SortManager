package com.sparta.alex.start;

import com.sparta.alex.binaryTree.BinaryTreeImplementation;
import com.sparta.alex.exceptions.InvalidInputException;
import com.sparta.alex.sorters.Sorter;
import com.sparta.alex.sorters.SorterFactory;
import com.sparta.alex.sorters.SorterTypes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Starter {

    public static final Logger logger = LogManager.getLogger(Starter.class);

    public static void start() {
        Sorter sorter;
        int typeOfSorter;
        try {
            typeOfSorter = InputScanner.getInt("What type of sorter would you like?\npress 1 for bubble sorter\npress 2 for merge sorter\npress 3 for binary tree sorter");
            if (typeOfSorter == 1) {
                sorter = SorterFactory.createSorter(SorterTypes.BUBBLE);
            } else if (typeOfSorter == 2) {
                sorter = SorterFactory.createSorter(SorterTypes.MERGE);
            } else if (typeOfSorter == 3) {
                sorter = SorterFactory.createSorter(SorterTypes.BINARY_TREE);
            } else {
                throw new InvalidInputException("Invalid type of sorter entered. Exiting program");
            }
        } catch (InvalidInputException e) {
            logger.error(e.getMessage(), e);
            return;
        }

        int lengthOfArray;
        try {
            lengthOfArray = InputScanner.getInt("\nWhat size array would you like to sort?");
            if (lengthOfArray < 0) {
                throw new InvalidInputException("Arrays can't be negative in size. Exiting program");
            }
        } catch (InvalidInputException e) {
                logger.error(e.getMessage(), e);
                return;
        }

        int typeOfArray;
        int[] arrayToSort;
        try {
            typeOfArray = InputScanner.getInt("\nWhat type of array would you like to sort?\npress 1 for a random array\npress 2 to enter your own values");
            if (typeOfArray == 1 && typeOfSorter != 3) {
                arrayToSort = ArrayFactory.createArray(ArrayType.RANDOM, lengthOfArray);
            } else if (typeOfArray == 1) {
                arrayToSort = ArrayFactory.createArray(ArrayType.UNIQUE_RANDOM, lengthOfArray);
            } else if (typeOfArray == 2) {
                arrayToSort = ArrayFactory.createArray(ArrayType.INPUT, lengthOfArray);
            } else {
                throw new InvalidInputException("Invalid type of array entered. Exiting program.");
            }
        } catch (InvalidInputException e) {
            logger.warn(e.getMessage(), e);
            return;
        }

        boolean isSorted = true;
        for (int i = 0, n = lengthOfArray - 1; i < n; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("This array is already sorted. Exiting program.");
            return;
        }

        System.out.println("\nUnsorted Array: " + Arrays.toString(arrayToSort));
        long startTime = System.nanoTime();
        int[] sortedArray = sorter.sortArray(arrayToSort);
        long endTime = System.nanoTime();
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        long timeTakenInMs = (endTime - startTime) / 1000000;
        System.out.println("It took " + timeTakenInMs + "ms to sort the array.");
    }
}
