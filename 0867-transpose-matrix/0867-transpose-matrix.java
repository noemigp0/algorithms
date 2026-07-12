class Solution {
    public int[][] transpose(int[][] matrix) {
        
        //    0 1 2
       //0   [1,2,3]    
       //1   [4,5,6]
       //2   [7,8,9]

       //     0 1 2      
       //0   [1,2,3]   {0,0},{0,1},{0,2}
       //1   [4,5,6]   {1,0},{1,1},{1,2}

       //     0 1
       //0   [1,4]     {0,0},{1,0} 
       //1   [2,5]     {0,1},{1,1}
       //2   [3,6]     {0,2},{1,2}
       //       i   

       int rows = matrix.length;//2
       int cols = matrix[0].length;//3

       int[][] transposedMatrix = new int[cols][rows];

       for(int row = 0; row < transposedMatrix.length; row++ ){
        for(int col = 0; col < transposedMatrix[row].length; col++){
            transposedMatrix[row][col] = matrix[col][row];

        }

       }

       return transposedMatrix;




        


       //{0,0},{0,1},{0,2}
       //{1,0},{1,1},{1,2}
       //{2,0},{2,1},{2,2}

        
    }
}