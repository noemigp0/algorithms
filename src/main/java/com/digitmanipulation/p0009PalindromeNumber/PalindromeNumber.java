package com.digitmanipulation.p0009PalindromeNumber;


/*
* Big O:
*   Time complexity: O(log10N)
*   Space complexity: O(1)
* */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 ){return false;}


        int reversed = 0;
        int n = x;

        while(n > 0){
        int lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;

        n = n /10;
        }

        return x == reversed;


        
    }
}