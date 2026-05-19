class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //         0 1 2 3 4 5
        //nums1 = [4,3,2,3,1], 
        //                 i
        //nums2 = [2,2,5,2,3,6]
        //                 j

        int nums1InNums2 = 0;//3
        int nums2InNums1 = 0;

        //elements in nums1 that exists in nusm2
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1InNums2++;
                    break;
                }
            }

        }

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    nums2InNums1++;
                    break;
                }
            }

        }

        return new int[]{nums1InNums2, nums2InNums1};

    }
}