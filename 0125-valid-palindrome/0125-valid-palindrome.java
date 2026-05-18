class Solution {
    public boolean isPalindrome(String s) {
        String cleanS = s.toLowerCase().replaceAll("[^a-zA-Z0-9]+", "");
    
        StringBuilder sb = new StringBuilder(cleanS).reverse();
        String reversed = sb.toString();
       
        return cleanS.equals(reversed);
        
    }
}