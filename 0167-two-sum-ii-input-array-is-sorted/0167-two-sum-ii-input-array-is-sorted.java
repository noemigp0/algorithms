class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length -1;
        // 0 1 2 3 4
        //[2,7,11,15], target = 9
        // l
        //   r

        

        while(left < right){
            int sum = numbers[left] + numbers[right];
           if (target == sum){
                return new int[]{left+1, right+1};
           } else if (sum > target){
                right--;
           } else {
                left++;
           }

        }

         return new int[]{left+1, right+1};
        
    }
}