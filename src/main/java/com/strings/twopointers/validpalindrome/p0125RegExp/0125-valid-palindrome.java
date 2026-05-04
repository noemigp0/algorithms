package com.strings.twopointers.p0125ValidPalindrome;


/*
* Big O
* Time complexity: O(n)
* Space complexity: O(1)
* */
class Solution {
    public boolean isPalindrome(String s) {

        String cleanS = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        String reversed = new StringBuilder(cleanS).reverse().toString();

        return cleanS.equals(reversed);
        
    }
}