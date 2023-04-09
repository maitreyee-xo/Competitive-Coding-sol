class Solution {
    public int longestPalindrome(String s) {
        if(s == null || s.length() < 1) return 0;
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i < s.length();i++)
        {
            if(hs.contains(s.charAt(i))) hs.remove(s.charAt(i));
            else hs.add(s.charAt(i));
        }
        if(hs.size() <= 1) return s.length();
        return s.length() - hs.size() + 1;
    }
}