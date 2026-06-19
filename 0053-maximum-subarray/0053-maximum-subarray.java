class Solution {
    public int maxSubArray(int[] nums) {

        //  0 1  2 3  4 5 6  7 8
        //[-2,1,-3,4,-1,2,1,-5,4]
        //                     f
        //  s    

        int fast = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (fast < nums.length) {
            sum += nums[fast];//5
            if (sum >= nums[fast]) {//1 >= -5
                maxSum = Math.max(maxSum, sum);//6
                fast++;
            } else {
                maxSum = Math.max(maxSum, sum);//2
                sum = 0;
            }

        }

        return maxSum;

    }
}