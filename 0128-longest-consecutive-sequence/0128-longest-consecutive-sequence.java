class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums)   hs.add(i);

        int longestSubsequence = 0;
        for (int i : hs) {
            if (!hs.contains(i - 1)) {
                int currentNum = i;
                while (hs.contains(currentNum + 1))    currentNum += 1;
                longestSubsequence = Math.max(longestSubsequence, currentNum - i + 1);
            }
        }
        return longestSubsequence;
    }
}
