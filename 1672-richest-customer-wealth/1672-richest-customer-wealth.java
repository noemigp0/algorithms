class Solution {
    public int maximumWealth(int[][] accounts) {

     //    0 1
    //0// [1,5]
    //1// [7,3]
    //2// [3,5]#
    //     

    
    int maxWealth = 0;
    for(int row = 0; row < accounts.length; row++){
        int wealthPerCustomer = 0;
        for(int col = 0; col < accounts[row].length; col++){

            wealthPerCustomer += accounts[row][col];//
            maxWealth = Math.max(wealthPerCustomer, maxWealth);//10
        }

    }

    return maxWealth;


        
    }
}