class Solution {
    public int maxSubArray(int[] nums) {

        //  0 1  2 3 4
        // [-1]
        //  i 

        int sum = 0;
        int maxSum = nums[0];     
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];//-1

            if(nums[i] > sum){//-1 > 1
                sum = nums[i];
            }

            maxSum = Math.max(maxSum, sum);//-1,0
        }

        return maxSum;
        
    }
}