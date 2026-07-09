class Solution {
    public int maximumWealth(int[][] accounts) {

        //     0 1 2
        //0   [1,2,3]
        //1   [3,2,1]]

        //matrix[row][col]
        //matrix.length --> gets rows
        //matrix[i].length -> gets cols

        //the external for moves the rows
        //the internal for moves the cols
        int maxWealth = 0;
        for (int row = 0; row < accounts.length; row++) {
            int moneyAmount = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                moneyAmount += accounts[row][col];
            }
            maxWealth = Math.max(moneyAmount, maxWealth);

        }

        return maxWealth;

    }
}