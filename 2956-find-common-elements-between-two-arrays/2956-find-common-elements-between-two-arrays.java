class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //nums1 in nums2
 
        int counter1  = 0;//3
        int counter2 = 0;

        //         0 1 2 3 4
        //nums1 = [4,3,2,3,1], 
        //             j
        //nums2 = [2,2,5,2,3,6]
        //         i

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    counter1++;
                    break;
                }
            }
        }

        for(int i = 0; i < nums2.length; i++){
            for(int j = 0; j < nums1.length; j++){
                if(nums1[j] == nums2[i]){
                    counter2++;
                    break;
                }
            }
        }

        return new int[]{counter1,counter2};
        
    }
}