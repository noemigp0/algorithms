class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        
        Set<Integer> nums2Set = new HashSet<>();
        Set<Integer> nums1Set = new HashSet<>();
        int nums1ElementsIn2 = 0;
        int nums2ElementsIn1 = 0;

        for(int i = 0; i < nums2.length; i++){
            nums2Set.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }


        // 0 1 2
        //[2,3,2]
        //     #   

        //{1,2}

        for(Integer element:nums1 ){
            if(nums2Set.contains(element)){
                nums1ElementsIn2++;
            }

        }

        for(Integer element: nums2){
            if(nums1Set.contains(element)){
                nums2ElementsIn1++;
            }

        }

        return new int[]{nums1ElementsIn2,nums2ElementsIn1};

    }
}