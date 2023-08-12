class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> hs = new HashSet<>();
        for (char x : s.toCharArray()) {
            if (hs.contains(x))   return x;
            hs.add(x);
        }
        return '\0';
    }
}
