class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.length() % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();                
                for (int j = 0; j < s.length() / i; j++)  repeated.append(substring);                
                if (repeated.toString().equals(s))  return true;
            }
        }        
        return false;
    }
}