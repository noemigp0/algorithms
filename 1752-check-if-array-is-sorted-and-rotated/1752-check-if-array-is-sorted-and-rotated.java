class Solution {
    public boolean check(int[] nums) {


        //        0 1 2 3 4
        //nums = [3,4,5,1,2]
        //                i l

        int breaks = 0;
        int len = nums.length;//5

        for(int i = 0; i < len; i++){

            if(nums[i] > nums[(i+1)%len]){
                breaks++;//1
            }
        }

        return breaks <= 1;
        
    }
}