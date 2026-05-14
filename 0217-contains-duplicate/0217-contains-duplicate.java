class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        // 0 1 2 3
        //[1,2,3,1]
        //   i


        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }

        return false;
        
    }
}