class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 0 1  2  3
        //[2,7,11,15]  , target = 9
        // l
        //   r
        int left = 0;
        int right = numbers.length -1;
        int[] result = new int[2];

        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                return result;

            }
            if(sum > target){
                right--;
            } else {
                left++;
            }


        }

        return result;
        
    }
}