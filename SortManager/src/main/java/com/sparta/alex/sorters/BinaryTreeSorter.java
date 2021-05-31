package com.sparta.alex.sorters;

import com.sparta.alex.binaryTree.BinaryTreeImplementation;

public class BinaryTreeSorter implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(arrayToSort[0]);
        for(int i = 1, n = arrayToSort.length; i < n; i++) {
            binaryTree.addElement(arrayToSort[i]);
        }
        return binaryTree.getSortedTreeAsc();
    }
}
