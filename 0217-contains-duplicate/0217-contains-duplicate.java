class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums)
        {
            if(hm.containsKey(i)) hm.put(i, hm.get(i) + 1);
            else hm.put(i,1);
        }
for (Map.Entry<Integer, Integer> enter : hm.entrySet()) {
    if (enter.getValue() > 1) return true;
        }
        return false;
    }
}