class Solution {
    public boolean check(int[] nums) {

        // 0 1 2 3 4 5
        //[3,4,5,1,2]
        //     i

        int breaks = 0;
        int n = nums.length; //4

        for(int i = 0; i < n; i++){

            if(nums[i] > nums[(i+1)%n] ){
                breaks++;//1
            }

        }

        return breaks <= 1;
        
    }
}