class Solution {
    public char findTheDifference(String s, String t) {
        if(s == null) return t.charAt(0);
        Map<Character, Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);
        }
        
        char ans = '\0';
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            if(map.size() > 0 && map.containsKey(ch)){
                if(map.get(ch) == 1){
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }    
            } else {
                return ch;
            }
            
            ans = ch;
        }
        return ans;
        
    }
}