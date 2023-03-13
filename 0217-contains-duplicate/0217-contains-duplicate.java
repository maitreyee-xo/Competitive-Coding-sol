class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i)){ hm.put(i, hm.get(i) + 1); return true;}
            else hm.put(i,1);
        }
        return false;
    }
}