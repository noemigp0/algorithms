class Solution {
    public int removeDuplicates(int[] nums) {
        // 0 1 2 3 4 5 6 7 8 9 10
        //[0,1,2,3,4,2,2,3,3,4]
        //         w
        //                   r


        int reader = 1;
        int writter = 0;

        while(reader < nums.length){

            if(nums[writter] != nums[reader]){
                writter++;
                nums[writter] = nums[reader];
            }
                reader++;
            
        }

        return writter+1;

        
    }
}