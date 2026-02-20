class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        //   0  1  2 3 4 5 
        // [-4,-1,-1,0,1,2 ]       [[-1,-1,2],[-1,0,1],[-1,0,1]]
        //         i
        //           l        
        //             r     
        // -1+0+1 =0

        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (left > i+1 && (nums[left] == nums[left - 1])) {
                    left++;
                    continue;
                }
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[i]);
                    triplets.add(nums[left]);
                    triplets.add(nums[right]);
                    results.add(triplets);
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }

            }

        }

        return results;

    }
}