class Solution {
    public int maxSubArray(int[] nums) {

        //   0    1  2 3  4 5 6  7 8
        //  [-2, -1]
        //          i
                       
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);//-1

            maxSum = Math.max(maxSum, currentSum);//-1

        }

        return maxSum;

    }
}