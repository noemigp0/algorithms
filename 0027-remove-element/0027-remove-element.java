class Solution {
    public int removeElement(int[] nums, int val) {
        // 0 1 2 3 4 5 6 7
        //[0,1,3,0,4,0,4,2], val = 2
        //           w
        //                 r


        int reader = 0;
        int writter = 0;

        while(reader < nums.length){

            if(nums[reader] != val){
                nums[writter] = nums[reader];
                writter++;
            }
            reader++;
        }

        return writter;
        
    }
}