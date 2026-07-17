class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //((end-1)-start)+1

        // 0 1 2 3 4 5 6
        //[2,3,1,2,4,3]
        //           s
        //             e

        int start = 0;
        int end = 0;
        int sum = 0;//
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;

        while(start < n){

            if(sum >= target){//3 >= 7
                minLen = Math.min(minLen, end-start);// 2
                sum -= nums[start];//3
                start++;

            } else if(end < n){
                sum += nums[end];//9
                end++;
            } else {
                break;
            }

        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}