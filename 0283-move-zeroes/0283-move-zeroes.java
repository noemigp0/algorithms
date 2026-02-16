class Solution {
    public void moveZeroes(int[] nums) {
        // 0 1 2 3  4   5
        //[1,3,12,0,0]
        //              r
        //              w

        int reader = 0;
        int writer = 0;
        int n = nums.length;

        while(writer < n){
            if(reader == n){
                nums[writer] = 0;
                writer++;
            } else if(nums[reader] != 0){
                nums[writer] = nums[reader];
                reader++;
                writer++;
                
            } else {
                reader++;
               
            }
        }




        
    }
}