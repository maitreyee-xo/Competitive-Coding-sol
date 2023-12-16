class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();
        for (char i : s.toCharArray())    mp.put(i, mp.getOrDefault(i, 0) + 1);
        for (char i : t.toCharArray())   mp2.put(i, mp2.getOrDefault(i, 0) + 1);
        return mp.equals(mp2);
    }
}
