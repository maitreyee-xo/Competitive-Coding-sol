class Solution {
    public String pushDominoes(String dominoes) {
        char[] result = dominoes.toCharArray();
        int prev = 0, n = result.length;
        for (int i = 0; i < n; i++) {
            if (result[i] == '.') continue;
            else if (result[i] == 'L') {
                if (result[prev] != 'R') Arrays.fill(result, prev, i, 'L');         // ....L
                else {                                                              // L...R
                    Arrays.fill(result, prev, (prev+i+1)/2, 'R');
                    Arrays.fill(result, (prev+i)/2 + 1, i, 'L');
                }
            }
            else if (result[prev] == 'R') Arrays.fill(result, prev, i, 'R');        // R...R
            prev = i;
        }
        if (result[prev] == 'R') Arrays.fill(result, prev, n, 'R');
        return String.valueOf(result);
    }
}