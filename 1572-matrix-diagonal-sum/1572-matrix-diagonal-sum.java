class Solution {
    public int diagonalSum(int[][] mat) {

       //row // col  0 1 2      
        //0  //     [1,2,3],
        //1         [4,5,6],
        //2         [7,8,9]

        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        int lastCol = mat.length -1;//1
        for(int row = 0; row < mat.length; row++){
            for(int col = 0; col < mat[row].length; col++){

                //row = 0 -> first elements of primary diagonal
                //mat[row].length -1 -> col 2  first element of secondary diagonal 
                //[0][0] [0][1] [0][2]
                //[1][0] [1][1] [1][2]
                //[2][0] [2][1] [2][2] 
                

                if(row == col){
                    primaryDiagonal += mat[row][col];//15
                }

                if(col == lastCol && row != col){
                   secondaryDiagonal += mat[row][col];//3
                   
                }

            }
            lastCol--;

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
