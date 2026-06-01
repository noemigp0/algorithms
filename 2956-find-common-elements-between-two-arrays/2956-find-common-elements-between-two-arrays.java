class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        //nums1 in nums2
        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();
        int counter1 = 0;
        int counter2 = 0;
        //nums1 = [4,3,2,3,1], nums2Set {2,5,3,6]}

        //nums2 = [2,2,5,2,3,6]

        for (Integer number : nums1) {
            nums1Set.add(number);
        }

        for (Integer number : nums2) {
            nums2Set.add(number);
        }

        for (Integer number : nums1) {
            if (nums2Set.contains(number)) {
                counter1++;//3
            }

        }

        for (Integer number : nums2) {
            if (nums1Set.contains(number)) {
                counter2++;//3
            }

        }

        return new int[]{counter1,counter2};

    }
}