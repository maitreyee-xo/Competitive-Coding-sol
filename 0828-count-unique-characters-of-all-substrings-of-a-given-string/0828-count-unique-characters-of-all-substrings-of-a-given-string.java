class Solution {
    public int uniqueLetterString(String s) {
       Map<Character, List<Integer>> charIndices = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charIndices.putIfAbsent(c, new ArrayList());
            charIndices.get(c).add(i);
        }
        int count = 0;
        for (List<Integer> charIdx: charIndices.values()) {
            for (int i = 0; i < charIdx.size(); i++) {
                int left = i == 0 ? charIdx.get(i) + 1 : charIdx.get(i) - charIdx.get(i-1);
                int right = i == charIdx.size()-1 ? s.length()-charIdx.get(i) : charIdx.get(i+1) - charIdx.get(i);
                count += left*right;
            }
        }
        return count;
    }
}