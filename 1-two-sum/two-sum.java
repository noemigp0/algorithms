class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 0 1 2 3 4
        //[2,7,11,15] target = 9
        // #
    //test
        Map<Integer, Integer> numsDictionary = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int secondNumber = target - nums[i];
            if(numsDictionary.containsKey(secondNumber)){
                return new int[]{i, numsDictionary.get(secondNumber)};
            }
            numsDictionary.put(nums[i], i);


        } 

        return new int[]{};
        
    }
}