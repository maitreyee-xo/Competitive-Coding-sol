class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        int maxm = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1') {
                    if(i == 0 || j == 0) dp[i][j] = 1;
                    else dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
                    maxm = Math.max(maxm, dp[i][j]);
                }
            }
        }
        return maxm * maxm;
    }
}
