class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] dp = new double[102][102];
        dp[0][0] = (double) poured; // pour all champagne into the first glass
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double overflow = (dp[i][j] - 1.0) / 2.0; // calculate overflow
                if (overflow > 0) {
                    dp[i + 1][j] += overflow; // distribute overflow to the glass below
                    dp[i + 1][j + 1] += overflow; // distribute overflow to the glass below and to the right
                }
            }
        }
        return Math.min(1.0, dp[query_row][query_glass]);
    }
}
