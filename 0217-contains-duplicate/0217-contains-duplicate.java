class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 0 1 2 3
        //[1,2,3,1]
        //       i

        //set: {1, 2, 3, }

        Set<Integer> setNums = new HashSet<>(); //O(n)

        for (int i = 0; i < nums.length; i++) {//O(n)
            if (setNums.contains(nums[i])) {
                return true;
            }
            setNums.add(nums[i]);

        }

        return false;

    }
}