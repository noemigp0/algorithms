class Solution {
    public int[][] transpose(int[][] matrix) {
        //   0 1 2 
        //0 [1,2,3]   {0,0},{0,1},{0,2}
        //1 [4,5,6]   {1,0},{1,1},{1,2}
        
        //   0 1
        //0 [1,4]     {0,0},{0,1}
        //     i
        //1 [0,0]     {1,0},{1,1}
        //2 [0,0]     {2,0},{2,1}


        int newRows = matrix[0].length;//3
        int newCols = matrix.length;//2
        int[][] transposedMatrix = new int[newRows][newCols];

        for(int row = 0; row < newRows; row++){
            for(int col = 0; col < newCols; col++){

                    transposedMatrix[row][col] = matrix[col][row];
                
            }

        }

        return transposedMatrix;






        //   0 1 2
        //0 [1,2,3] {0,0},{0,1},{0,2}
        //1 [4,5,6] {1,0},{1,1},{1,2}
        //2 [7,8,9] {2,0},{2,1},{2,2}

        //   0 1 2
        //0 [1,4,7] {0,0},{0,1},{0,2}
        //1 [2,5,8] {1,0},{1,1},{1,2}
        //2 [3,6,9] {2,0},{2,1},{2,2}
        
    }
}