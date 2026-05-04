package com.strings.twopointers.p0125ValidPalindrome;


/*
* Big O
* Time complexity: O(n)
* Space complexity: O(1)
* */
class Solution {
    public boolean isPalindrome(String s) {
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
}