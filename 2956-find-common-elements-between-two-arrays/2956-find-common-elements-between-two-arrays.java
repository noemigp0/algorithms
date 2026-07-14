class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        // 0 1 2
        //[2,3,2], 
        //     i
        //[1,2]
        //   j

        int nums1InNums2 = 0;
        int nums2InNums1 = 0;

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    nums1InNums2++;
                    break;
                }
            }

        }

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums1[j] == nums2[i]){
                    nums2InNums1++;
                    break;
                }
            }

        }

        return new int[]{nums1InNums2,nums2InNums1};
        
    }
}