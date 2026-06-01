class Solution {
    public boolean containsDuplicate(int[] nums) {

        // 0 1 2 3
        //[1,2,3,1]
        // i
        Set<Integer> numsSet = new HashSet<>();


        for(Integer number: nums){
            if(numsSet.contains(number)){
                return true;
            }
            numsSet.add(number);
        }

        return false;
        
    }
}