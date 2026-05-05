class Solution {
    public boolean isPalindrome(int x) {

        if( x < 0 ){
            return false;
        }

        int reversed = 0;
        int newX = x;

        
       while(newX > 0){
            int lastDigit = newX%10;
            newX = newX/10; 
            reversed = reversed * 10 + lastDigit; //121
       }
            
        

        return x == reversed;

        
    }
}