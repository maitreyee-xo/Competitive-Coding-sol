class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void pairs(int n, int k, List<Integer> arr)
    {
        if(k == 0) {ans.add(new ArrayList<>(arr));
        return;}
        if(k == n){
            arr.add(n);
            pairs(n-1, k-1, arr);
            arr.remove(arr.size() -1);
        }
        else if(n > k)
        {
            pairs(n - 1, k, arr);
            arr.add(n);
            pairs(n - 1, k - 1, arr);
            arr.remove(arr.size() - 1);

        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        pairs(n, k, arr);
        return ans;
    }
}