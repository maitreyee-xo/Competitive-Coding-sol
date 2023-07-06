class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sumOfWindow = 0;
        int lo = 0, hi = 0;
        int ans = Integer.MAX_VALUE;
        for(hi = 0; hi < nums.length;hi++)
        {
            sumOfWindow += nums[hi];
        while(sumOfWindow >= target)
        {
            ans = Math.min(ans,hi-lo+1);
            sumOfWindow -= nums[lo++]; 
        }
    }
        return ans == Integer.MAX_VALUE? 0 : ans;
}}