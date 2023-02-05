class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        if(s.length() < p.length())
            return ans;
        HashMap<Character, Integer> phm = new HashMap<Character, Integer>();
        for(int i = 0 ; i < p.length();i++)
        {
            phm.put(p.charAt(i), phm.getOrDefault(p.charAt(i), 0)+1);
        }
        HashMap<Character, Integer> shm = new HashMap<>(); 
        int left = 0, right = 0;
        while(right < s.length())
        {
            char c = s.charAt(right);
            shm.put(c, shm.getOrDefault(c, 0) + 1);
            if(right - left == p.length() - 1)
            {
                if(shm.equals(phm))
                {
                    ans.add(left);
                }
                char leftChar = s.charAt(left);
                shm.put(leftChar, shm.get(leftChar) - 1);
                shm.remove(leftChar, 0);
                left++;
            }
            right++;
        }
        return ans;
    }
}