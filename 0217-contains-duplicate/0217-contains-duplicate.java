class Solution {
    public boolean containsDuplicate(int[] nums) {


        //        0 1 2 3
        //nums = [1,2,3,1]
        //              i

        //numsStack = {1,2,3, }

        Set<Integer> numStack = new HashSet<Integer>();

        for(Integer num: nums){
            if(numStack.contains(num)){
                return true;
            }
            numStack.add(num);
        }

        return false;

        
    }
}