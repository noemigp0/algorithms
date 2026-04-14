class Solution {
    public boolean isPalindrome(String s) {
        //if(s.length() == null || s.length() == 0 ){ return false;}

        //"a man, a plan, a canal: panama"
        //       l
        //                          r

        int left = 0;
        int right = s.length() -1;

        String phrase = s.toLowerCase();

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