class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray())  hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        Set<Integer> frequenciesSeen = new HashSet<>();
        int deletions = 0;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int frequency = entry.getValue();
            while (frequenciesSeen.contains(frequency)) {
                frequency--;
                deletions++;
            }
            if (frequency > 0)  frequenciesSeen.add(frequency);
        }
        return deletions;
    }
}