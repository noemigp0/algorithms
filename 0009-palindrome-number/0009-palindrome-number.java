class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 ){return false;}

        //121 

        int reversed = 0;
        int n = x;

        while(n > 0){
        int lastDigit = n % 10;//1
        reversed = reversed * 10 + lastDigit; //121

        n = n /10;//0.11
        }

        return x == reversed;


        
    }
}