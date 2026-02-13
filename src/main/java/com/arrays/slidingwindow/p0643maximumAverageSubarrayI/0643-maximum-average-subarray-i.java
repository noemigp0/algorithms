package com.arrays.slidingwindow.p0643maximumAverageSubarrayI;

/*
* Big O:
* time complexity: O(n)
* Space complexity: O(1)*/

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        

        // 0 1   2  3  4 5 
        //[1,12,-5,-6,50,3]  k=4
        //       s 
        //               e        
        //   i

        int startWindow = 0;
        int endWindow = k - 1;
        double  sum = 0;
        double result = Double.NEGATIVE_INFINITY;//Improvements

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i]; //13

            if( i == endWindow){
                result = Math.max(result, sum/k);
                sum = sum - (nums[startWindow]);
                startWindow++;//1
                endWindow++;//4
            }
        }
        return result;

        
    }
}