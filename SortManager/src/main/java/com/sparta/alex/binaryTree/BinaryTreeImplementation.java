package com.sparta.alex.binaryTree;

import com.sparta.alex.exceptions.ChildNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImplementation implements BinaryTree {

    private int size = 0;
    private Node root;
    private final List<Integer> allNumbers = new ArrayList<>();

    private static class Node {
        final int number;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.number = value;
            this.left = left;
            this.right = right;
        }
    }

    public void setRootElement(int element){
        if (root != null) {
            System.out.println("Root element already set.");
            return;
        }
        root = new Node(element, null, null);
        size++;
    }

    @Override
    public int getRootElement() {
        if (root == null) {
            throw new NullPointerException();
        }
        return root.number;
    }

    @Override
    public int getNumberOfElements() {
        return size;
    }

    @Override
    public void addElement(int element) {
        if (findElement(element)) {
            System.out.println("This number already exists in the tree. Number not added");
            return;
        }
        Node node = root;
        Node newNode = new Node(element, null, null);
        while (node != null) {
            if (element > node.number) {
                if (node.right == null) {
                    node.right = newNode;
                    break;
                }
                node = node.right;
            } else if (element < node.number) {
                if (node.left == null) {
                    node.left = newNode;
                    break;
                }
                node = node.left;
            }
        }
        size++;
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        Node node = root;
        while (node != null) {
            if (value == node.number) {
                return true;
            } else if (value > node.number) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new NullPointerException();
        }
        Node node = travelToNode(element);
        if (node.left == null) {
            throw new ChildNotFoundException("Child not found");
        }
        return node.left.number;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new NullPointerException();
        }
        Node node = travelToNode(element);
        if (node.right == null) {
            throw new ChildNotFoundException("Child not found");
        }
        return node.right.number;
    }

    @Override
    public int[] getSortedTreeAsc() {
        allNumbers.clear();
        addAllNumbersAsc(root);
        int[] allNumbersArray = new int[size];
        int i = 0;
        for (Integer number : allNumbers) {
            allNumbersArray[i] = number;
            i++;
        }
        return allNumbersArray;
    }

    @Override
    public int[] getSortedTreeDesc() {
        allNumbers.clear();
        addAllNumbersDesc(root);
        int[] allNumbersArray = new int[size];
        int i = 0;
        for (Integer number : allNumbers) {
            allNumbersArray[i] = number;
            i++;
        }
        return allNumbersArray;
    }

    public void addAllNumbersAsc(Node node) {
        if (node.left != null) {
            addAllNumbersAsc(node.left);
        }
        allNumbers.add(node.number);
        if (node.right != null) {
            addAllNumbersAsc(node.right);
        }
    }

    public void addAllNumbersDesc(Node node) {
        if (node.right != null) {
            addAllNumbersDesc(node.right);
        }
        allNumbers.add(node.number);
        if (node.left != null) {
            addAllNumbersDesc(node.left);
        }
    }

    private Node travelToNode(int number) {
        Node node = root;
        while (node != null) {
            if (number > node.number) {
                node = node.right;
            } else if (number < node.number) {
                node = node.left;
            } else {
                break;
            }
        }
        return node;
    }
}