class Solution {
    public int uniquePaths(int m, int n) {
        double totalPaths = 1;
        for (int i = 1; i < Math.min(m, n); ++i) {
            totalPaths = totalPaths * (n + m - i - 1) / i;
        }
        return (int) totalPaths;
    }
}
