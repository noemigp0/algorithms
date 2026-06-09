class Solution {
    public boolean check(int[] nums) {


        // 0 1 2 3 4
        //[2,1,3,4]
        //       i
        // +

        int breaks = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                breaks++;//2
            }

        }

        return breaks<=1;
        
    }
}