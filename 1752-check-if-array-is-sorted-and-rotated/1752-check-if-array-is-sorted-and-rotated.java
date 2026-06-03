class Solution {
    public boolean check(int[] nums) {
        if (nums.length == 0 || isSorted(nums)) {
            return true;
        }
        //creating copy
        int[] numsSorted = new int[nums.length];
        for (int i = 0; i < numsSorted.length; i++) {
            numsSorted[i] = nums[i];
        }
        //        0 1 2 3 4
        //nums = [2,1,3,4]
        //            i
        //       [1,3,4,2]



        int rotations = 0;
        int len = numsSorted.length;

        while (rotations < len) {
            int auxCopy = numsSorted[0];//2

            for (int i = 0; i < len - 1; i++) {
                numsSorted[i] = numsSorted[i + 1];
            }
            numsSorted[len - 1] = auxCopy;

            if (isSorted(numsSorted)) {
                return true;
            }
            rotations++;
        }

        return false;

    }

    // 0 1 2 3 
    //[1,3,4,2]
    //       i

    public static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }

        }
        return true;

    }
}