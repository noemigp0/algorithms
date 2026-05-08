class Solution {
    public boolean isPalindrome(String s) {
        //AmanaplanacanalPanama
        // l
        //                   r  

        String cleanS = s.replaceAll("[^a-zA-Z0-9]+","");

        int left = 0;
        int right = cleanS.length() -1;

        while(left <= right ){

            if(Character.toLowerCase(cleanS.charAt(left)) != Character.toLowerCase(cleanS.charAt(right))){
                return false;
            }

            left++;
            right--;

        }
        return true;
  
    }
}