class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        //x = 121

        int reversed = 0;
        int temporalX = x;//121

        while(temporalX > 0) {//121

            int lastDigit = temporalX % 10;//1
            temporalX = temporalX / 10;//0
            reversed = reversed * 10 + lastDigit;//121
        }

        return x == reversed;

    }
}