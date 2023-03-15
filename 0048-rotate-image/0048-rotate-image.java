class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < (matrix.length+1)/2;i++)
        {
            for(int j = 0; j < matrix.length/2;j++)
            {
                int temp = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-j-1];   
                matrix[matrix.length-1-i][matrix.length-j-1] = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}