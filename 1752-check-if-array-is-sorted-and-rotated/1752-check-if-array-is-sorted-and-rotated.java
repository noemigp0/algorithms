class Solution {
    public boolean check(int[] nums) {

        //notes: Do you really need aother array
        // do you really need to keep rotating if the minimum number is already at position 0
        //if the minimum number is already at position 0 do you need to keep validating the order?
        if (nums.length == 1) {
            return true;
        }

        int[] auxArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            auxArray[i] = nums[i];
        }
        //            0 1 2 3 
        //nums     = [1,2,3]

        //auxArray = [1,2,3]    
        //                i

        int rotations = 0;
        int len = auxArray.length - 1; //3

        while (rotations < auxArray.length) {// rotations 4

            int breaks = 0;
            for (int i = 1; i < auxArray.length; i++) {
                if (auxArray[i - 1] > auxArray[i]) {
                    breaks++;//1
                    break;
                }

            }

            if (breaks == 0) {
                return true;
            }

            int firstNumber = auxArray[0];//4
            for (int i = 1; i < auxArray.length; i++) {

                auxArray[i - 1] = auxArray[i];
                if (i == len) {
                    auxArray[i] = firstNumber;
                }

            }

            rotations++;

        }

        return false;
    }
}