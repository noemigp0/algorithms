class Solution {
    public int[] sortedSquares(int[] nums) {
        //  0  1 2 3  4
        //[-4,-1,0,3,10]
        //     l
        //       r
        //[100,16, 9,1, 0]
        //           i

        int left = 0;
        int right = nums.length -1;
        int[] result = new int[nums.length];

        for(int i = result.length-1 ; i >=0 ; i--){
            int leftSquare = nums[left] * nums[left];//1
            int rightSquare = nums[right] * nums[right];//0

            if(leftSquare > rightSquare){//1>0
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }

        }

        return result;
        
    }
}