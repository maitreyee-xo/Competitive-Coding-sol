class Solution {
    private List<List<String>> ret = new ArrayList<>();

    private boolean isValid(List<String> board, int row, int col) {
        for (int i = row; i >= 0; --i) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; --i, --j) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.size(); --i, ++j) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    private void dfs(List<String> board, int row) {
        if (row == board.size()) {
            ret.add(new ArrayList<>(board));
            return;
        }

        for (int i = 0; i < board.size(); ++i) {
            if (isValid(board, row, i)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(i, 'Q');
                board.set(row, sb.toString());
                dfs(board, row + 1);
                sb.setCharAt(i, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        if (n <= 0) {
            List<String> emptyRow = new ArrayList<>();
            emptyRow.add("");
            List<List<String>> emptyResult = new ArrayList<>();
            emptyResult.add(emptyRow);
            return emptyResult;
        }

        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            board.add(".".repeat(n));
        }

        dfs(board, 0);
        return ret;
    }
}
