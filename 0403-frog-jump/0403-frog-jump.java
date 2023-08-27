class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        // Create a map to store which positions have stones for faster lookup
        Map<Integer, Set<Integer>> stoneJumps = new HashMap<>();
        for (int stone : stones) {
            stoneJumps.put(stone, new HashSet<>());
        }
        
        // Initialize the first stone with the first jump size
        stoneJumps.get(0).add(0);

        for (int i = 0; i < n; i++) {
            for (int jump : stoneJumps.get(stones[i])) {
                for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                    if (nextJump > 0 && stoneJumps.containsKey(stones[i] + nextJump)) {
                        stoneJumps.get(stones[i] + nextJump).add(nextJump);
                        if (stones[i] + nextJump == stones[n - 1]) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
