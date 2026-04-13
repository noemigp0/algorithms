class Solution {
    public boolean isPalindrome(String s) {
        String phrase = s.toLowerCase();

        int left = 0;
        int right = s.length() -1;

        //"A man, a plan, a canal: Panama"
        // l
        //                              r

        while(left < right){

            if(!Character.isLetterOrDigit(phrase.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(phrase.charAt(right))){
                right--;
                continue;
            }

            if(phrase.charAt(left) != phrase.charAt(right)){
                return false;

            }
            left++;
            right--;
        }

        return true;
        
    }
}