class Solution {
    public int maximumWealth(int[][] accounts) {

        //   0 1
        //0 [1,5]  {0,0},{0,1}
        //1 [7,3]  {1,0},{1,1}
        //2 [3,5]  {2,0},{2,1}

        
        int maxWealth = 0;

        for(int row = 0; row < accounts.length; row++){//1
        int wealth = 0;
            for(int col = 0; col < accounts[row].length; col++){//1

                wealth += accounts[row][col];//10
                
            }
                maxWealth = Math.max(maxWealth, wealth);//10

        }

        return maxWealth;
        
    }
}