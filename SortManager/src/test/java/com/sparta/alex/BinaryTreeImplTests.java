package com.sparta.alex;

import com.sparta.alex.binaryTree.BinaryTreeImplementation;
import com.sparta.alex.exceptions.ChildNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryTreeImplTests {

    @Test
    public void shouldReturnRoot() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(5);
        Assertions.assertEquals(5, binaryTree.getRootElement());
    }

    @Test
    public void shouldThrowNullPointerException() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        Assertions.assertThrows(NullPointerException.class, binaryTree::getRootElement);
    }

    @Test
    public void shouldReturnSize() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[]{8,5,16,18,32,36});
        Assertions.assertEquals(7, binaryTree.getNumberOfElements());
    }

    @Test
    public void shouldReturnSize0() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        Assertions.assertEquals(0, binaryTree.getNumberOfElements());
    }

    @Test
    public void doesNotAddDuplicates() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(9);
        binaryTree.addElements(new int[] {8,8,8,8,4,6});
        Assertions.assertEquals(4, binaryTree.getNumberOfElements());
    }

    @Test
    public void shouldReturnTrue() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {8,12,16,15,3});
        Assertions.assertTrue(binaryTree.findElement(15));
    }

    @Test
    public void shouldReturnFalse() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {8,12,16,15,3});
        Assertions.assertFalse(binaryTree.findElement(19));
    }

    @Test
    public void shouldReturnLeftChild() throws ChildNotFoundException {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertEquals(12, binaryTree.getLeftChild(17));
    }

    @Test
    public void shouldReturnRightChild() throws ChildNotFoundException {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertEquals(34, binaryTree.getRightChild(25));
    }

    @Test
    public void shouldThrowChildNotFoundExceptionLeft() throws ChildNotFoundException {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getLeftChild(5));
    }

    @Test
    public void shouldThrowChildNotFoundExceptionRight() throws ChildNotFoundException {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertThrows(ChildNotFoundException.class, () -> binaryTree.getRightChild(34));
    }

    @Test
    public void shouldReturnSortedArrayAsc() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertArrayEquals(new int[]{5,6,9,10,12,17,25,34}, binaryTree.getSortedTreeAsc());
    }

    @Test
    public void shouldReturnSortedArrayDesc() {
        BinaryTreeImplementation binaryTree = new BinaryTreeImplementation();
        binaryTree.setRootElement(10);
        binaryTree.addElements(new int[] {5,17,25,34,12,6,9});
        Assertions.assertArrayEquals(new int[]{34,25,17,12,10,9,6,5}, binaryTree.getSortedTreeDesc());
    }
}
