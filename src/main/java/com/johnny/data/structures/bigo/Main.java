package com.johnny.data.structures.bigo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        printItems(10);
//        printItemsOofNSquared(10);
//        addItemsOofOne(10);
        arrayListBigO();
    }

    // Notes:
    // O(n^2) -> Loop within a loop
    // O(n) -> Proportional... straight line
    // O(logn) -> Divide and Conquer
    // O(1) -> Constant time

    private static void arrayListBigO() {
        List<Integer> myList = new ArrayList<>(List.of(11, 3, 23, 7));
        // Adding and removing from end of array is O(1) because it does
        // not touch any item before the end of the list
        //
        // Adding and removing from the beginning of the array is O(n),
        // where n is the array length, because it has to move each array index
        myList.forEach(System.out::println);
    }

    /**
     * This is O(1) -> Does not matter how big n is, it's still
     * only 1 operation. This is the most efficient of Big O
     * @param n
     * @return
     */
    private static int addItemsOofOne(int n) {
        return n + n;
    }

    /**
     * This is O(n^2) - ran n * n times
     * @param n
     */
    private static void printItemsOofNSquared(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }
        // Drop non-dominants:
        // This method it O(dominant^2 + non-dominant)
        // O(n^2 + n) but as n grows, dominant is much more intensive than
        // non-dominant, so we just drop the non-dominant and keep the notation
        // O(n^2)
        for(int k = 0; k < n; k++){
            System.out.println(k);
        }
    }

    /**
     * This is O(n) as the loop will run a worst case of "n" times
     * @param n
     */
    public static void printItems(int n) {
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        // Drop Constant notation O(2n) -> still O(n)
        for(int j = 0; j < n; j++){
            System.out.println(j);
        }
    }
}

