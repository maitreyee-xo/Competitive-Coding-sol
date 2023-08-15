class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> possibilities = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        combinationSum3(k, n, 1, currentCombination, possibilities);
        return possibilities;
    }
    public void combinationSum3(int k, int n, int start, List<Integer> currentCombination, List<List<Integer>> possibilities) {
        if (k == 0 && n == 0) {
            possibilities.add(new ArrayList<>(currentCombination));
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > n) break;
            currentCombination.add(i);
            combinationSum3(k - 1, n - i, i + 1, currentCombination, possibilities);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
