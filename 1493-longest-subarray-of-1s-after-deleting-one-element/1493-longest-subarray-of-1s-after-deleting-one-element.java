class Solution {
    public int longestSubarray(int[] nums) {
        int zero=0;
        int i=0,j=0,res=0;
        while(j<nums.length){
            if(nums[j]==0)
                zero++;
            if(zero>1){
                while(nums[i++]!=0);
                zero--;
            }
            res=Math.max(res,j-i);
            j++;
        }
        return res;
    }
}