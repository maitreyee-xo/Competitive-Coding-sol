class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0;
        long subarray = 0;
        for(int i : nums)
        {
            if(i == 0) subarray++;
            else subarray = 0; 
                total += subarray;
        }
        return total;
    }
}