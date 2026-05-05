class Solution {
    public boolean isPalindrome(int x) {
        String stringOfX = String.valueOf(x);
        int left = 0;
        int right = stringOfX.length() -1;

        if(stringOfX.charAt(right) == 0){
            return false;
        }

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