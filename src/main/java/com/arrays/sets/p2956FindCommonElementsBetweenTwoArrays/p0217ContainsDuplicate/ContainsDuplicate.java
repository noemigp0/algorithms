package com.arrays.sets.p2956FindCommonElementsBetweenTwoArrays.p0217ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;



public class ContainsDuplicate {

    /*
    * Big O:
    * Time complexity: O(n)
    * Space complexity: O(n)
    * */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // 0 1 2 3
        //[1,2,3,1]
        //   i


        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
        
    }
}