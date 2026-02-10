package com.arrays.p0011ContainerwithMostWater;

/*
 * Algorithm: Two pointers
 *
 * Big O:
 * Time complexity: O(n)
 * Space complexity O(1)
 */

class Solution {
    public int maxArea(int[] height) {
       // 0 1 2 3 4 5 6 7 8
       //[1,8,6,2,5,4,8,3,7]
       //   l
       //   r

       //[1,1]
       // l
       // r

       int left = 0;//0
       int right = height.length -1 ; //
       int width = 0; //
       int area = 0;
       int result = 0;


       while(left < right){
            width = right - left; //1- 0 = 1
            area = width * (Math.min(height[left], height[right]));//1 (1) = 1
            result = Math.max(area, result); //(1)
           
            if(height[left] < height[right]){//(8)
                left++;

            } else {
                right--;
            }


       }

       return result;

        
    }
}