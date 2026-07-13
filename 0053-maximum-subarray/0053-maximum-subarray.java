class Solution {
    public int maxSubArray(int[] nums) {


        //         0 1  2 3  4 5 6  7 8
        //nums =  [-1]
        //         i

        int currentSum = 0;
        int maxSum = nums[0];

        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i]; //1

            if(nums[i] > currentSum){//1> 1
                currentSum = nums[i];//
            }

            maxSum = Math.max(currentSum, maxSum);//0,1
        }

        return maxSum;
        
    }
}