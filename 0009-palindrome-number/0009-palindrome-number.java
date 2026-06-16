class Solution {
    public boolean isPalindrome(int x) {
        int newX = x;//121
        int reversed = 0;
        //121

        while (newX > 0) {//1
            int lastDigit = newX % 10;//1
            reversed = reversed * 10 + lastDigit;//121
            newX = newX / 10;//1
        }

        return reversed == x;

    }
}