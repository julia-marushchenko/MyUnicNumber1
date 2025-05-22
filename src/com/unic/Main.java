// Java program to find unic element
package com.unic;

import java.util.HashSet;
import java.util.Set;

// Main class
public class Main {

    // Method findUnicNumber to find number is unic
    public static int findUnicNumber(int[] arr) {

        // Using set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                set.remove(arr[i]);
            } else {
                set.add(arr[i]);
            }
        }
        return (int) set.toArray()[0];
    }

    // Method main to run java program
        public static void main (String [] args){

            int [] array = {3, 5, 4, 5, 6, 6, 8, 3, 4};
            System.out.println(findUnicNumber(array));
    }
}
