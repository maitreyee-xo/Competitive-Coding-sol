class Node {
    int first;
    int second;
    int third;

    Node(int fir, int sec, int thi) {
        this.first = fir;
        this.second = sec;
        this.third = thi;
    }
}

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dis = new int[n][m];
        Queue<Node> q = new LinkedList<Node>();

        // Initialize distances for zero cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    dis[i][j] = 0;
                    q.add(new Node(i, j, 0));
                } else {
                    dis[i][j] = Integer.MAX_VALUE; // Initialize to a large value
                }
            }
        }

        int[] delrow = {-1, 0, +1, 0};
        int[] delcol = {0, +1, 0, -1};

        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int steps = q.peek().third;
            q.remove();

            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && dis[nrow][ncol] > steps + 1) {
                    dis[nrow][ncol] = steps + 1;
                    q.add(new Node(nrow, ncol, steps + 1));
                }
            }
        }

        return dis;
    }}