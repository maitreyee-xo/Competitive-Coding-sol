class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int check = (int) Math.floor(nums.length / 3.0);
        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0)+1);
        for(int x : hm.keySet())
        {
            if(hm.get(x) > check) arr.add(x);
        }
        return arr;
    }
}