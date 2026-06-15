class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){return 1;}

        //0 1 2 3 4 5 6 7
        //a u
        //i            
        //  j                 

        //'a'
        //'u'
        int maxWindow = 0;
        
        for(int i = 0; i < s.length(); i++){
            Set<Character> charSet = new HashSet<>();
            for(int j = i; j < s.length(); j++){ 
                if(charSet.contains(s.charAt(j))){
                    maxWindow = Math.max(charSet.size(),maxWindow );
                    break;
                }
                charSet.add(s.charAt(j));
                maxWindow = maxWindow == 0 ? charSet.size() : Math.max(maxWindow, charSet.size());//1
            }
            //
        }

        return maxWindow;
        
    }
}