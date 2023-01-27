class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for(int x : nums)
        {
            if(hm.containsKey(x)) {hm.put(x,hm.get(x) + 1);}
            else{hm.put(x,1);}
        }
        for(int num : hm.keySet())
        {
            if(hm.get(num) == 1) {res = num;}
        }
        return res;
    }
}