package com.arrays.p001TwoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 0 1  2  3
        //[2,7,11,15]
        //   i

        //dictonary
        // key Value
        //  2   0   

        Map<Integer, Integer> dictionary = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int secondNumber = target - nums[i]; //2

            if(dictionary.containsKey(secondNumber)){
                return new int[]{i, dictionary.get(secondNumber)};
            }

            dictionary.put(nums[i], i);

        }

        return new int[]{};
        
    }
}