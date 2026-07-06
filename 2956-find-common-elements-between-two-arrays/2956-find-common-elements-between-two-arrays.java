class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //nums1 in nums 2

        int counter1 = 0;
        Set<Integer> nums2Stack = new HashSet<>();

        for(Integer num: nums2){
            nums2Stack.add(num);
        }

        for(int i = 0; i < nums1.length; i++){
            if(nums2Stack.contains(nums1[i])){
                counter1++;
            }
        }

        int counter2 = 0;
        Set<Integer> nums1Stack = new HashSet<>();

        for(Integer num: nums1){
            nums1Stack.add(num);
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums1Stack.contains(nums2[i])){
                counter2++;
            }
        }

        return new int[]{counter1,counter2};
        
    }
}