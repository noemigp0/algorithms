class Solution {
    public boolean check(int[] nums) {

        //        0 1 2 3 4
        //nums = [5,1,5,1]
        //              i  
        int n = nums.length;
        int breaks = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[(i+1)%n]){ 
                breaks++;//2

                if(breaks > 1){
                    return false;
                }
            }
        }


        return breaks <= 1;



        
    }
}