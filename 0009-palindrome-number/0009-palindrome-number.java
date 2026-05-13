class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0){ return false;}

        String stringOfX = String.valueOf(x);
        //012
        //121
        // l 
        // r


        int left = 0;
        int right = stringOfX.length() - 1;

        while(left <= right){

            if(stringOfX.charAt(left) != stringOfX.charAt(right)){
                return false;
            }
            left++;
            right--;

        }

        return true;




        
    }
}