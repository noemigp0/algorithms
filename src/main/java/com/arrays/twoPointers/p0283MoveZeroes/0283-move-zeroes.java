package com.arrays.twoPointers.p0283MoveZeroes;

/* Big(O)
* Time complexity: O(n)
* Space complexity: O(1)
* */
class Solution {
    public void moveZeroes(int[] nums) {
        // 0 1 2 3  4   5
        //[1,3,12,0,0]
        //              r
        //              w

        int reader = 0;
        int writer = 0;
        int n = nums.length;

        while(reader < n){
            if(nums[reader] != 0){
                nums[writer] = nums[reader];
                //reader++;
                writer++;
   
            } 
                reader++;
               
            
        }

        for (int i = writer; i < n; i++){
            nums[i] = 0;

        }




        
    }
}