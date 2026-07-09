class Solution {
    public int diagonalSum(int[][] mat) {

        //row // col 0 1 2      
        //0  //     [1,2,3],
        //1         [4,5,6],
        //2         [7,8,9]

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int n = mat.length - 1;//0
        for (int row = 0; row <= n; row++) {

            primaryDiagonal += mat[row][row];//15

            if ((n-row) != row) {
                secondaryDiagonal += mat[row][n-row];//10
            }



        }
        return secondaryDiagonal + primaryDiagonal;
    }
}

//        0 1 2 3  
//0   // [1,1,1,1],
//1   // [1,1,1,1],
//2   // [1,1,1,1],
//3   // [1,1,1,1]

// [0][0] [0][1] [0][2] [0][3]
// [1][0] [1][1] [1][2] [1][3]
// [2][0] [2][1] [2][2] [2][3]
// [3][0] [3][1] [3][2] [3][3]
