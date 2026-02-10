package com.arrays.binarysearch.p0704vanillabinarysearch;
/*
* Standard binary search
* Note: since arrays are 0-indexed, the right pointer should be set to nums.length - 1
* BigO: O(log n) time with O(1) extra space
*/

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1 ;

        while( left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid -1;
            } else {
                left = mid +1;
            }

        }

        return -1;
    }
}