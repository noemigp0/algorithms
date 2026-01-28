class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1 ;
        //  0 1 2 3 4 5
        //[-1,0,3,5,9,12]
        //        m 
        //          l
        //            r

        while( left <= right){
            int mid = left + (right - left) / 2; //4 + (5 - 4) / 2 = 5 

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid -1;
            } else {
                left = mid +1;
            }

        }

        return -1;
    }
}