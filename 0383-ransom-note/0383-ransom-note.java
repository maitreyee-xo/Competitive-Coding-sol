class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        int [] alphabets = new int[26];
        for(char ch : magazine.toCharArray())   alphabets[ch - 'a']++;
        for(char ch : ransomNote.toCharArray())
        {
            if(alphabets[ch - 'a'] == 0) return false;
            alphabets[ch - 'a']--;
        }
        return true;
    }
}