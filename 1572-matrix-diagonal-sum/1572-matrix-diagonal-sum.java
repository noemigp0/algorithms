class Solution {
    public int diagonalSum(int[][] mat) {

        //   0 1 2
        //0 [1,2,3]    {0,0},{0,1},{0,2}
        //1 [4,5,6]    {1,0},{1,1},{1,2}
        //2 [7,8,9]    {2,0},{2,1},{2,2}

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int col = mat[0].length - 1;//3

        for (int row = 0; row < mat.length; row++) {//2

            primaryDiagonal += mat[row][row];//{0,0} 1+5+9

            if (row != col) {
                secondaryDiagonal += mat[row][col];//{2,1} //3+7
            }

            col--;
        }

        return primaryDiagonal + secondaryDiagonal;

    }
}