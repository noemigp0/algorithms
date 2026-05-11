class Solution {
    public boolean isPalindrome(String s) {

        //"amanaplancanalpanama"

        String cleanS = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        StringBuilder sb = new StringBuilder(cleanS).reverse();
        String reversed = sb.toString();

        return cleanS.equals(reversed);
        
    }
}