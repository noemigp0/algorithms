class Solution {
    public void moveZeroes(int[] nums) {

        // 0 1 2  3  4
        //[1,3,12,3,12]
        //        w
        //             r

        int reader = 0;
        int writter = 0;
        while (reader < nums.length) {
            if (nums[reader] != 0) {
                nums[writter] = nums[reader];
                writter++;

            }
            reader++;

        }

        for (int i = writter; i < nums.length; i++) {
            nums[i] = 0;

        }

    }
}