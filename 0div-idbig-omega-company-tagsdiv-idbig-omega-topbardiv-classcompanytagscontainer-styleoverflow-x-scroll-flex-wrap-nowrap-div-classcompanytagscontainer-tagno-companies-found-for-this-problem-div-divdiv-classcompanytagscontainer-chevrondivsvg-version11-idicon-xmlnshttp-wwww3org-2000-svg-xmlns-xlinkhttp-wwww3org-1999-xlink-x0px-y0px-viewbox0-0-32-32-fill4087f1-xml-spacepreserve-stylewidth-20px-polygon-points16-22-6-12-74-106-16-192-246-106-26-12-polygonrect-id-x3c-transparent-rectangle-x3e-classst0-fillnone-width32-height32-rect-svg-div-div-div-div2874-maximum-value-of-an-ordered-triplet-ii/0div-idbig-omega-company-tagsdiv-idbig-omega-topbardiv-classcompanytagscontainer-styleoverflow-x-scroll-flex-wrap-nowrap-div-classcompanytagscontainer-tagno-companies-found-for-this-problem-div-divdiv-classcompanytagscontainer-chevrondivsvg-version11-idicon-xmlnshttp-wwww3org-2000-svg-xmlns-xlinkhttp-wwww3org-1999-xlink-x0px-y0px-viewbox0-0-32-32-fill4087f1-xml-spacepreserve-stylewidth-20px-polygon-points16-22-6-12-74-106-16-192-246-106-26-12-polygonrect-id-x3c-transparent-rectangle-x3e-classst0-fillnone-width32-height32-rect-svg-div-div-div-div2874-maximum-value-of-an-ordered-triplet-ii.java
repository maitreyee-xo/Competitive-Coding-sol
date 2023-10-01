class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long[] prefix_max = new long[n];
        long[] suffix_max = new long[n];
                prefix_max[0] = nums[0];
        for (int i = 1; i < n; i++)    prefix_max[i] = Math.max(prefix_max[i - 1], nums[i]);    
        suffix_max[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) suffix_max[i] = Math.max(suffix_max[i + 1], nums[i]);        
        long maxTripletValue = Long.MIN_VALUE;
        for (int j = 1; j < n - 1; j++) {
            long tripletValue = (prefix_max[j - 1] - nums[j]) * suffix_max[j + 1];
            maxTripletValue = Math.max(maxTripletValue, tripletValue);
        }
    return Math.max(maxTripletValue, 0);
    }
}
