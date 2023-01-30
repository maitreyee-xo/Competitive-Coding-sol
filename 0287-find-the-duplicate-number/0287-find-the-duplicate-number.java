class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int duplicate = 0;
        for(int x : nums)
        {
            if(hm.containsKey(x)) {hm.put(x,hm.get(x) + 1);}
            else{hm.put(x,1);}
        }
        for(int num : hm.keySet())
        {
            if(hm.get(num) > 1) {duplicate = num;}
        }
        return duplicate;
    }
}