class Solution {
    public boolean check(int[] nums) {
        // 0 1 2 3 4
        //[2,1,3,4]
        // i

        //rotar y verificar si esta ordenado

        int n = nums.length; //4
        int rotations = 0;

        boolean isSorted = isSorted(nums);

        while (rotations <= n) {//2 && true
            int aux = nums[0];//5
            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[n - 1] = aux;
            rotations++;//3
            if(isSorted(nums)){
                return true;
            }
        }

        return false;

    }

    public boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;

    }
}