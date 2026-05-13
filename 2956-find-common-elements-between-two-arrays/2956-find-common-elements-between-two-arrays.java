class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        // 0 1 2
        //[2,3,2]
        //     i
        //[1,2]
        //   i
        //nums2Set   ->  1,2
        //nums1Set   ->  2,3


        //Elements in nums1 available in nums2
        Set<Integer> nums2Set = new HashSet<>();
        for(Integer element: nums2){
            nums2Set.add(element); 
        }

        int counter1 = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums2Set.contains(nums1[i])){
                counter1++;//1
            }
        }

        Set<Integer> nums1Set = new HashSet<>();
        for(Integer element: nums1){
            nums1Set.add(element);
        }

        int counter2 = 0;
        for(int i = 0; i < nums2.length; i++){
            if(nums1Set.contains(nums2[i])){
                counter2++;//1
            }
        }

        return new int[]{counter1,counter2};



        
    }
}