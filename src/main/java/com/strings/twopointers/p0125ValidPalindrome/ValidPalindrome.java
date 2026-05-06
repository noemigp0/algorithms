package com.strings.twopointers.p0125ValidPalindrome;



public class ValidPalindrome {

    /*
     * Big O
     * Time complexity: O(n)
     * Space complexity: O(1)
     * */

    public boolean isPalindromeOptimalSolution(String s){
        //a man, a plan, a canal: panama
        //                 l
        //                 r

        int left = 0;
        int right = s.length() -1;

        while(left <= right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }

        return true;

    }




    /*
     * Big O
     * Time complexity: O(n)
     * Space complexity: O(n)
     * */

    public boolean isPalindromeUsingRegExp(String s){
        String newS = s.replaceAll("[^a-zA-Z0-9]+","");

        int left = 0;
        int right = newS.length() -1;

        while (left <= right){
            if(Character.toLowerCase(newS.charAt(left)) != Character.toLowerCase(newS.charAt(right)))
            {
                return false;

            }
            left++;
            right--;

        }

        return true;
    }
    /*
     * Big O
     * Time complexity: O(n)
     * Space complexity: O(n)
     * */
    public boolean isPalindromeUsingStringBuilder(String s) {

        String cleanS = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        String reversed = new StringBuilder(cleanS).reverse().toString();

        return cleanS.equals(reversed);
        
    }
}