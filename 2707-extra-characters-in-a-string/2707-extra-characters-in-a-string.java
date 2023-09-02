class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();        
        for (String word : dictionary)  dict.add(word);        
        int[] dp = new int[s.length() + 1]; 
        for (int i = 1; i <= s.length(); i++) 
        {
            dp[i] = dp[i - 1] + 1; 
            for (int j = i; j >= 1; j--)
            {
                String sub = s.substring(j - 1, i);
                if (dict.contains(sub)) dp[i] = Math.min(dp[i], dp[j - 1]);
            }
        }

        return dp[s.length()];    
    }
}
