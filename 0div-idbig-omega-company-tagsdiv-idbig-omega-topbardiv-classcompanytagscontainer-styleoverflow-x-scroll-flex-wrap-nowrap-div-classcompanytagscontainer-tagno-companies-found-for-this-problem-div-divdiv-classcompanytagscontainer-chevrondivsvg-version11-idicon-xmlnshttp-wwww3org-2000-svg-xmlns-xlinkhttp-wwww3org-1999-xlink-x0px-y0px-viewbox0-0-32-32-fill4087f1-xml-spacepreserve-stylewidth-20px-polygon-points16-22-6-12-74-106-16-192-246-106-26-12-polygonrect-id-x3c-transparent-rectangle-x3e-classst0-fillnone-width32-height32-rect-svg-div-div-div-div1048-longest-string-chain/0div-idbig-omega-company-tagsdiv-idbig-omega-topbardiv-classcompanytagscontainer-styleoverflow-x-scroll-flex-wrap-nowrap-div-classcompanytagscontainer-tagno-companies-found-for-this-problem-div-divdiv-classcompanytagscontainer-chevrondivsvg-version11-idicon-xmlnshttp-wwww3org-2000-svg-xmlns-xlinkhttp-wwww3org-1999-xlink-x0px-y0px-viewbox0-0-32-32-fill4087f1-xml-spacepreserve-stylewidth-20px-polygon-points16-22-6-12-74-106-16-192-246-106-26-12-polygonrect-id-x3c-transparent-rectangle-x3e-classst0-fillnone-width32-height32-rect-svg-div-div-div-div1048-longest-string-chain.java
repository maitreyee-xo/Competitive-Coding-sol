class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length()); // Sort the words by length
        HashMap<String, Integer> dp = new HashMap<>();
        int maxChainLength = 0;
        for (String word : words) {
            int longestChainForWord = 1;
            for (int i = 0; i < word.length(); i++) {
                StringBuilder predecessor = new StringBuilder(word);
                predecessor.deleteCharAt(i);
                String predStr = predecessor.toString();
                if (dp.containsKey(predStr))  longestChainForWord = Math.max(longestChainForWord, dp.get(predStr) + 1);
            }
            dp.put(word, longestChainForWord);
            maxChainLength = Math.max(maxChainLength, longestChainForWord);
        }
        return maxChainLength;
    }
}
