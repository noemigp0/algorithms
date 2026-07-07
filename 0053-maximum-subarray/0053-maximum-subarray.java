class Solution {
    public int maxSubArray(int[] nums) {

        //  0 1  2 3  4 5 6  7 8
        // [5,4,-1,7,8]
        //           i

        int currentSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            
           currentSum += nums[i];//23
           if(nums[i] > currentSum){// 8 > 23
                currentSum = nums[i];//
           }

           maxSum = Math.max(maxSum, currentSum);//23
        }

        return maxSum;

    }
}