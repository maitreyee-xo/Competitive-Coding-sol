class Solution {
    int dp[][][] = new int[51][51][101];
    int n, m, k;
    public int solve(int idx, int largestNum, int lengthArr) 
    {
        if(idx == n)
        {
            if(lengthArr == k) return 1;
            return 0;
        }
        if(dp[idx][lengthArr][largestNum] != -1) return dp[idx][lengthArr][largestNum];
        int ans = 0;
        for(int i = 1; i <= m;i++)
        {
            if(i > largestNum) ans+= solve(idx+1,i,lengthArr+1);
            else ans += solve(idx+1,largestNum, lengthArr);
            ans %= 1000000007;
        }
        return dp[idx][lengthArr][largestNum] = ans;
    }
    public int numOfArrays(int N, int M, int K) {
        n = N;
        m = M;
        k = K;
        for (int i = 0; i < 51; i++) {
            for (int j = 0; j < 51; j++) {
                for (int k = 0; k < 101; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return solve(0, 0, 0);
    }
}