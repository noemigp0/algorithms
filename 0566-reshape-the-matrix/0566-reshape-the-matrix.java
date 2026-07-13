class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int elements = mat.length * mat[0].length; //4
        int expectedElements = r * c;//4
        if(elements != expectedElements){
            return mat;
        }
        int[][] reshapedMatrix = new int[r][c];

        //   0 1 
        //0 [1,2]    {0,0},{0,1}
        //     i
        //1 [3,4]    {1,0},{1,1}
        //     i
        // row = 2  cols = 2
        //
        //         0 1 2 3
        //0       [1,2,3,0] {0,0},{0,1},{0,2},{0,3} 

        //r = 1, c = 4

        int newRow = 0;
        int newCol=  0;//3
        for(int row = 0; row < mat.length; row++){//0
            for(int col = 0; col < mat[row].length; col++){//0

                
                reshapedMatrix[newRow][newCol] = mat[row][col];
                newCol++;
                if(newCol == c){//0 == 3
                    newCol = 0;
                    newRow++;
                }

            }

        }

        return reshapedMatrix;
        
    }
}