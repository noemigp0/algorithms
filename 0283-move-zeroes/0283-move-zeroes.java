class Solution {
    public void moveZeroes(int[] nums) {
        int[] numsB = new int[nums.length];
        int n = nums.length;

        // 0 1 2 3 4
        //[0,1,0,3,12]   numsB
        //            j 
        //[1,3,12,3,12]   nums
        //        k

        for(int i = 0; i < n ; i++){
            numsB[i] = nums[i]; 
        }

        int j = 0;
        int k = 0;
        while(k < n){
            if(j >= n){
                nums[k] = 0;
                k++;
            } else if(numsB[j] != 0){
                nums[k] = numsB[j];
                k++;
                j++;
            } else{
                j++;

            }
            
            

        }
        
    }
}