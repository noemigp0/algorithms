package com.arrays.sets.p2956FindCommonElementsBetweenTwoArrays;

import java.util.HashSet;
import java.util.Set;

/*
* Big O
* Time complexity: O(n)
* Space complexity: O(n)
* */

public class FindCommonElementsBetweenTwoArrays {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //Elements in nums1 available in nums2
        Set<Integer> nums2Set = new HashSet<>();
        for(Integer element: nums2){
            nums2Set.add(element); 
        }

        int counter1 = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums2Set.contains(nums1[i])){
                counter1++;//1
            }
        }

        Set<Integer> nums1Set = new HashSet<>();
        for(Integer element: nums1){
            nums1Set.add(element);
        }

        int counter2 = 0;
        for(int i = 0; i < nums2.length; i++){
            if(nums1Set.contains(nums2[i])){
                counter2++;//1
            }
        }

        return new int[]{counter1,counter2};



        
    }


    /*
    * Big O:
    * Time complexity: O(n2)
    * Space complexity: O(1)
    * */
    public int[] findIntersectionValuesUsingNestedLoop(int[] nums1, int[] nums2) {

        // 0 1 2 3 4
        //[2,3,2]
        //     i
        //[1,2]
        //   j

        int counter1 = 0;//2
        int counter2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    counter1++;
                    break;
                }
            }

        }

        // 0 1 2 3 4
        //[1,2]
        //   i
        //[2,3,2]
        // j

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    counter2++;
                    break;

                }
            }

        }

        return new int[] { counter1, counter2 };

    }
}