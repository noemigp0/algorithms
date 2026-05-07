package com.arrays.twoPointers.p0088MergeSortedArray;


/*
* Big O
* Time complexity: O(n+m)
* Space complexity: O(1)
* */

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //         0 1 2 3 4 5
        //nums1 = [1,2,3,0,0,0], m = 3, 
        //                   w
        //             1
        //nums2 = [2,5,6], n = 3
        //             2

        int reader1 = m-1; //3-1 = 2
        int reader2 = n-1;//3-1 = 2

        for(int writter = m+n-1; writter >= 0; writter--){
            if(reader2 < 0){ break;}
            if(reader1 >= 0 && nums1[reader1] > nums2[reader2]){
                nums1[writter] = nums1[reader1];
                reader1--;

            } else {
                nums1[writter] = nums2[reader2];
                reader2--;
            }

        }

        
    }
}