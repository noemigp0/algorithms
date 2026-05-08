class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {return false;}

        int reversedX = 0;
        int temporalX = x;

        //x = 121

        while (temporalX > 0) {//i = 1
            int remaining = temporalX % 10;//1
            temporalX = temporalX / 10;//0
            reversedX = remaining  + reversedX * 10;//121
        }

        return x == reversedX;

    }
}