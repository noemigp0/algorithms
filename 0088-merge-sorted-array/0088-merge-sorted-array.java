class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //         0 1 2 3 4 5
        //nums1 = [2,0], m = 1, 
        //           i
        //         1

        //nums2 = [1], n = 1
        //         2  

        int nums1Index = m - 1;//0
        int nums2Index = n - 1;//0

        for (int i = m + n - 1; i >= 0; i--) {
            if (nums2Index < 0) {
                break;
            }
            if (nums1Index >= 0 && nums1[nums1Index] > nums2[nums2Index]) {
                nums1[i] = nums1[nums1Index];
                nums1Index--;

            } else {
                nums1[i] = nums2[nums2Index];
                nums2Index--;
            }

        }

    }
}