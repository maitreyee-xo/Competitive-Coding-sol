class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int x : nums)
        {
            if(hm.containsKey(x)) return x;
            hm.put(x,1);
        }
        return 0;
    }
}