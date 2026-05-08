class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> numsMap = new HashMap<>();//{1,0},{2,1}, {3,2}}

        // 0 1 2 3
        //[1,2,3,1]
        //       i

        for(int i = 0; i < nums.length; i++){

            if(numsMap.containsKey(nums[i])){
                return true;
            }
            numsMap.put(nums[i], i);
        }

        return false;

        
    }
}