class Solution {
    public boolean check(int[] nums) {

        // 0 1 2 3 4
        //[2,1,3,4]
        //       i   

        //1.-Solo puede haber un "break"
        //2.-ya que compararlo de manera circular

        int n = nums.length - 1;
        int breaks = 0;

        for (int i = 1; i <= n; i++) {

            if (nums[i] < nums[i - 1]) {
                breaks++;//1
            }

        }

        if (nums[n] > nums[0]) {
            breaks++;
        }

        return breaks <= 1;

    }
}