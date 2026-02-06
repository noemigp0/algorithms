class Solution {
    public boolean isPalindrome(String s) {
        //"A man, a plan, a canal: Panama"
        // l
        //                              r

        int left = 0;
        int right = s.length() -1;

        while(left <= right){
           
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            
            if(Character.isLetterOrDigit(leftChar) && Character.isLetterOrDigit(rightChar)){
                leftChar = Character.toLowerCase(leftChar);
                rightChar = Character.toLowerCase(rightChar);
                
                if(leftChar != rightChar){
                    return false;
                }
                 right--;
                 left++;
            }

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }

            
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }


        }
        return true;
        
    }
}