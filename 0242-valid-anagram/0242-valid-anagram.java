class Solution {
    public boolean isAnagram(String s, String t) {

        //0 1 2 3 4 5 6
        //a n a g r a m
        //            i
        //n a g a r a m
        //            i

        //sHashTable
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        //3 0 0 0 0 0 1 0 0 0  0  0  1  1  0  0  0  1  0  0  0  0  0  0  0  0

        //tHashTable
        //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
        //3 0 0 0 0 0 1 0 0 0  0  0  1  1  0  0  0  1  0  0  0  0  0  0  0  0
        int[] sHashTable = new int[26];
        int[] tHashTable = new int[26]; //

        for (int i = 0; i < s.length(); i++) {
            sHashTable[s.charAt(i) - 'a']++ ;// 97 - 97
        }

        for (int i = 0; i < t.length(); i++) {
            tHashTable[t.charAt(i) - 'a']++; // 110-97, 114 - 97 

        }

        for(int i = 0 ; i < 26; i++){
            if(sHashTable[i] != tHashTable[i]){
                return false;
            }
        }

        return true;

    }
}