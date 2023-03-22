class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        res.add(new ArrayList<>());
        if(nums == null || nums.length == 0) return res;
        int sum = 0;
        for(int x: nums)
        {
            sum = res.size();
            for(int i = 0; i < sum;i++)
            {
                List<Integer> set = new ArrayList<>(res.get(i));
                set.add(x);
                res.add(set);
            }
        }
        return res;
    }
}