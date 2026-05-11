class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        // 0 1 2 3 4
        //[2,3,2] 
        //     i
        //[1,2]
        //   j

        int counter1 = 0;//2
        int counter2 = 0;
        Map<Integer,Integer> map1 = new HashMap<>();//{2,0}
        Map<Integer,Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    counter1++;
                    break;    
                }
            }

        }

        // 0 1 2 3 4
        //[1,2] 
        //   i
        //[2,3,2]
        // j

        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    counter2++;
                    break;
                    
                }
            }

        }

        return new int[] { counter1, counter2 };

    }
}