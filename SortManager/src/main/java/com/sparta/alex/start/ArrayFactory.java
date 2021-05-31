package com.sparta.alex.start;

import com.sparta.alex.start.ArrayType;
import com.sparta.alex.start.InputScanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayFactory {

    public static int[] createArray(ArrayType type, int size) {
        if (type == ArrayType.UNIQUE_RANDOM) {
            List<Integer> randomNumbers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                randomNumbers.add(i);
            }
            Collections.shuffle(randomNumbers);
            int[] randomArray = new int[size];
            for (int i = 0; i < size; i++) {
                randomArray[i] = randomNumbers.get(i);
            }
            return randomArray;
        }
        if (type == ArrayType.INPUT) {
            int[] intArray = new int[size];
            String userNumbers = InputScanner.getString("\nEnter a list of numbers separated by commas: ");
            String[] numbersAsStrings = userNumbers.split(",");
            for (int i = 0; i < size; i++) {
                intArray[i] = Integer.parseInt(numbersAsStrings[i]);
            }
            return intArray;
        }
        if (type == ArrayType.RANDOM) {
            int[] randomArray = new int[size];
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                randomArray[i] = random.nextInt(10000);
            }
            return randomArray;
        }
        return null;
    }
}
