class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] rowsAndStrength = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int countOfOnes = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) countOfOnes++; 
                else  break;
            }
            rowsAndStrength[i][0] = i;
            rowsAndStrength[i][1] = countOfOnes; 
        }
        Arrays.sort(rowsAndStrength, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]); // If strengths are equal, sort by row index.
            }
            return Integer.compare(a[1], b[1]); // Otherwise, sort by strength.
        });
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowsAndStrength[i][0];
        }
        return result;
    }
}
