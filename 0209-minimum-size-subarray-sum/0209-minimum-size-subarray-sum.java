class Solution {
    public int minSubArrayLen(int target, int[] nums) {


        // 0 1 2 3 4 5 6
        //[2,3,1,2,4,3]   target //7
        //             s
        //             e

        int start = 0;
        int end = 0;
        int sum = 0;
        int subArrayLen = Integer.MAX_VALUE;

        while(start < nums.length){

            //
            if(sum >= target){ //3
                subArrayLen = Math.min(subArrayLen, ((end -1) - start)+1);//2
                sum -= nums[start];//7
                start++;
            } else if(end < nums.length){
                sum += nums[end];// 9
                end++;
            } else {
                start++;
            }

           


        }

        return subArrayLen == Integer.MAX_VALUE ? 0: subArrayLen;

    }
}