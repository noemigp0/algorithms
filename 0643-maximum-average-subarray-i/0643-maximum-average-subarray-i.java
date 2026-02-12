class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        //To keep in mind: if there is no parentesis, the operation will be perform from left to right (when + and - involved)
        // 0 1   2  3  4 5 
        //[1,12,-5,-6,50,3]  k=4
        //       s 
        //               e        
        //   i

        // 0
        //[-1]
        // s
        // e
        //i

        int startWindow = 0;
        int endWindow = k - 1;
        double  sum = 0;
        double result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i]; //13

            if( i == endWindow){
                result = Math.max(result, sum/k);//0 , 1/4
                sum = sum - (nums[startWindow]); //51 - 12 = 39
                startWindow++;//1
                endWindow++;//4
            }
        }
        return result;

        
    }
}