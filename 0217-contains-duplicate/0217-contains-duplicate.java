class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 0 1 2 4
        //[1,2,3,1]
        // i

        //{1},{},{}
        

        Set<Integer> hashSetNums = new HashSet<>();

        for(int i=0; i < nums.length; i++){
            if(hashSetNums.contains(nums[i])){
                return true;
            }
            hashSetNums.add(nums[i]);

        }

        return false;

        
        
    }
}