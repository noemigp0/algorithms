package com.arrays;

import java.util.Arrays;

/*
* Given an array of integers,
* our task is to write a program that efficiently finds the second-largest element present in the array.

Input: arr[] = {12, 35, 1, 10, 34, 1}
Output: The second largest element is 34.
Explanation: The largest element of the array is 35 and the second largest element is 34

Input: arr[] = {10, 5, 10}
Output: The second largest element is 5.
Explanation: The largest element of the array is 10 and the second largest element is 5

Input: arr[] = {10, 10, 10}
Output: The second largest does not exist.
Explanation: Largest element of the array is 10 there is no second largest element
*
*
* Big O complexity
* Time O(N)
* Space O(1)
* */
public class SecondLargestElementInTheArray {

    public static void main (String args[]){

        int secondLargestElement = getSecondLargestElementImproved(new int[]{12, 35, 1, 10, 34, 1});
        System.out.print(secondLargestElement);

    }

    public static int getSecondLargestElement(int[] input){
        //  0   1  2   3   4  5
        //[12, 35, 1, 10, 34, 1]
        int largestElement = Integer.MIN_VALUE;

        for(int i = 0; i < input.length; i++){
            largestElement = Math.max(input[i], largestElement);
        }

        int secondLargestElement = Integer.MIN_VALUE;
        for(int i = 0; i < input.length; i++){

            if(input[i] != largestElement) {
                secondLargestElement = Math.max(input[i], secondLargestElement);
            }
        }
        return secondLargestElement == Integer.MIN_VALUE ? largestElement: secondLargestElement;

    }


    public static int getSecondLargestElementImproved(int[] input){
        return 0;
    }
}
