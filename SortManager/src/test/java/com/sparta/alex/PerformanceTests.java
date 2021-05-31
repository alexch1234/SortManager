package com.sparta.alex;

import com.sparta.alex.sorters.BinaryTreeSorter;
import com.sparta.alex.sorters.BubbleSorter;
import com.sparta.alex.sorters.MergeSorter;
import com.sparta.alex.sorters.Sorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PerformanceTests {
    Sorter bubbleSorter = new BubbleSorter();
    Sorter mergeSorter = new MergeSorter();
    Sorter binaryTreeSorter = new BinaryTreeSorter();

    @Test
    public void performanceWith1000elements(){
        int sizeOfArray = 1000;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            randomNumbers.add(i);
        }
        Collections.shuffle(randomNumbers);
        int[] randomArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = randomNumbers.get(i);
        }

        System.out.println("---performance with " + sizeOfArray + " elements---");
        long startTimeBubble = System.nanoTime();
        bubbleSorter.sortArray(Arrays.copyOf(randomArray, sizeOfArray));
        long endTimeBubble = System.nanoTime();
        long bubbleSortTime = (endTimeBubble - startTimeBubble) / 1000000;
        System.out.println("Bubble sort took " + bubbleSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeMerge = System.nanoTime();
        mergeSorter.sortArray(randomArray);
        long endTimeMerge = System.nanoTime();
        long mergeSortTime = (endTimeMerge - startTimeMerge) / 1000000;
        System.out.println("Merge sort took " + mergeSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeBinaryTree = System.nanoTime();
        binaryTreeSorter.sortArray(randomArray);
        long endTimeBinaryTree = System.nanoTime();
        long binaryTreeSortTime = (endTimeBinaryTree - startTimeBinaryTree) / 1000000;
        System.out.println("Binary tree sort took " + binaryTreeSortTime + "ms to sort an array of " + sizeOfArray + " elements");
    }

    @Test
    public void performanceWith10000elements(){
        int sizeOfArray = 10000;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            randomNumbers.add(i);
        }
        Collections.shuffle(randomNumbers);
        int[] randomArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = randomNumbers.get(i);
        }

        System.out.println("\n---Performance with " + sizeOfArray + " elements---");
        long startTimeBubble = System.nanoTime();
        bubbleSorter.sortArray(Arrays.copyOf(randomArray, sizeOfArray));
        long endTimeBubble = System.nanoTime();
        long bubbleSortTime = (endTimeBubble - startTimeBubble) / 1000000;
        System.out.println("Bubble sort took " + bubbleSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeMerge = System.nanoTime();
        mergeSorter.sortArray(randomArray);
        long endTimeMerge = System.nanoTime();
        long mergeSortTime = (endTimeMerge - startTimeMerge) / 1000000;
        System.out.println("Merge sort took " + mergeSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeBinaryTree = System.nanoTime();
        binaryTreeSorter.sortArray(randomArray);
        long endTimeBinaryTree = System.nanoTime();
        long binaryTreeSortTime = (endTimeBinaryTree - startTimeBinaryTree) / 1000000;
        System.out.println("Binary tree sort took " + binaryTreeSortTime + "ms to sort an array of " + sizeOfArray + " elements");
    }

    @Test
    public void performanceWith20000elements(){
        int sizeOfArray = 20000;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            randomNumbers.add(i);
        }
        Collections.shuffle(randomNumbers);
        int[] randomArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = randomNumbers.get(i);
        }

        System.out.println("\n---Performance with " + sizeOfArray + " elements---");
        long startTimeBubble = System.nanoTime();
        bubbleSorter.sortArray(Arrays.copyOf(randomArray, sizeOfArray));
        long endTimeBubble = System.nanoTime();
        long bubbleSortTime = (endTimeBubble - startTimeBubble) / 1000000;
        System.out.println("Bubble sort took " + bubbleSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeMerge = System.nanoTime();
        mergeSorter.sortArray(randomArray);
        long endTimeMerge = System.nanoTime();
        long mergeSortTime = (endTimeMerge - startTimeMerge) / 1000000;
        System.out.println("Merge sort took " + mergeSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeBinaryTree = System.nanoTime();
        binaryTreeSorter.sortArray(randomArray);
        long endTimeBinaryTree = System.nanoTime();
        long binaryTreeSortTime = (endTimeBinaryTree - startTimeBinaryTree) / 1000000;
        System.out.println("Binary tree sort took " + binaryTreeSortTime + "ms to sort an array of " + sizeOfArray + " elements");
    }

    @Test
    public void performanceWith30000elements(){
        int sizeOfArray = 30000;
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < sizeOfArray; i++) {
            randomNumbers.add(i);
        }
        Collections.shuffle(randomNumbers);
        int[] randomArray = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = randomNumbers.get(i);
        }

        System.out.println("\n---Performance with " + sizeOfArray + " elements---");
        long startTimeBubble = System.nanoTime();
        bubbleSorter.sortArray(Arrays.copyOf(randomArray, sizeOfArray));
        long endTimeBubble = System.nanoTime();
        long bubbleSortTime = (endTimeBubble - startTimeBubble) / 1000000;
        System.out.println("Bubble sort took " + bubbleSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeMerge = System.nanoTime();
        mergeSorter.sortArray(randomArray);
        long endTimeMerge = System.nanoTime();
        long mergeSortTime = (endTimeMerge - startTimeMerge) / 1000000;
        System.out.println("Merge sort took " + mergeSortTime + "ms to sort an array of " + sizeOfArray + " elements");

        long startTimeBinaryTree = System.nanoTime();
        binaryTreeSorter.sortArray(randomArray);
        long endTimeBinaryTree = System.nanoTime();
        long binaryTreeSortTime = (endTimeBinaryTree - startTimeBinaryTree) / 1000000;
        System.out.println("Binary tree sort took " + binaryTreeSortTime + "ms to sort an array of " + sizeOfArray + " elements");
    }
}
