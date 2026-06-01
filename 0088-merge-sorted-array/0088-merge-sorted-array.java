class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //         0 1 2 3 4 5
        //nums1 = [1,2,2,3,5,6], m = 3, 
        //           1
        //           w
        //nums2 = [2,5,6], n = 3
        //       2

        //nums1 = [1], m = 0, 
        //      -1
        //nums2 = [1], n = 1
        //         2

        int reader1 = m -1 ;
        int reader2 = n - 1;
        int writter = m + n - 1;

        while(reader2 >= 0){

            if(reader1 >= 0 && nums1[reader1] > nums2[reader2]){
                nums1[writter] = nums1[reader1];
                reader1--;
            } else {
                nums1[writter] = nums2[reader2];
                reader2--;
            }

            writter--;
            

        }



        
    }
}