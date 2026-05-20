class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Set<Integer> nums1Set = new HashSet<>();//{2,3}
        Set<Integer> nums2Set = new HashSet<>();
        int counter1 = 0;
        int counter2 = 0;

        for(int num: nums1){
            nums1Set.add(num);
        }  

        for(int num: nums2){
            nums2Set.add(num);
        }  

        //nums1 in nums2
        for(int i = 0; i < nums1.length; i++){
            if(nums2Set.contains(nums1[i])){
                counter1++;
            }

        }

                //nums1 in nums2
        for(int i = 0; i < nums2.length; i++){
            if(nums1Set.contains(nums2[i])){
                counter2++;
            }

        }

        return new int[]{counter1++,counter2++};
        
        
    }
}