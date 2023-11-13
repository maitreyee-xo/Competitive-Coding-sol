class Solution {
    public String sortVowels(String s) {
        int n = s.length();
        StringBuilder t = new StringBuilder();        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')  t.append(ch);
        }        
        List<Character> vowels = new ArrayList<>();
        for (int i = 0; i < t.length(); i++)   vowels.add(t.charAt(i));
        Collections.sort(vowels);        
        int j = 0;
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' || ch == 'A' ||
                ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')     result[i] = vowels.get(j++);
                else  result[i] = ch;
        }        
        return new String(result);
    }
}
