package com.arrays.sets.p0217ContainsDuplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ContainsDuplicate {

    /*
    * Big O:
    * Time complexity: O(nlogn)
    * Space complexity: O(1)
    * */
    public boolean containsDuplicateUsingSort(int[] nums) {
        Arrays.sort(nums);//Time complexity: O(nlogn)
        // 0 1 2 3
        //[1,2,3,1]
        //   i
        for(int i = 1; i < nums.length; i++){//Time complexity: O(n)
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }

    /*
    Big O
    Time complexity: O(n)
    Space complexity: O(n)

    * */
    public boolean containsDuplicate(int[] nums) {
        // 0 1 2 3
        //[1,2,3,1]
        //       i

        //set: {1, 2, 3, }

        Set<Integer> setNums = new HashSet<>();//Space complexity: O(n)

        for (int i = 0; i < nums.length; i++) {//Time complexity: O(n)
            if (setNums.contains(nums[i])) {
                return true;
            }
            setNums.add(nums[i]);

        }

        return false;

    }
}