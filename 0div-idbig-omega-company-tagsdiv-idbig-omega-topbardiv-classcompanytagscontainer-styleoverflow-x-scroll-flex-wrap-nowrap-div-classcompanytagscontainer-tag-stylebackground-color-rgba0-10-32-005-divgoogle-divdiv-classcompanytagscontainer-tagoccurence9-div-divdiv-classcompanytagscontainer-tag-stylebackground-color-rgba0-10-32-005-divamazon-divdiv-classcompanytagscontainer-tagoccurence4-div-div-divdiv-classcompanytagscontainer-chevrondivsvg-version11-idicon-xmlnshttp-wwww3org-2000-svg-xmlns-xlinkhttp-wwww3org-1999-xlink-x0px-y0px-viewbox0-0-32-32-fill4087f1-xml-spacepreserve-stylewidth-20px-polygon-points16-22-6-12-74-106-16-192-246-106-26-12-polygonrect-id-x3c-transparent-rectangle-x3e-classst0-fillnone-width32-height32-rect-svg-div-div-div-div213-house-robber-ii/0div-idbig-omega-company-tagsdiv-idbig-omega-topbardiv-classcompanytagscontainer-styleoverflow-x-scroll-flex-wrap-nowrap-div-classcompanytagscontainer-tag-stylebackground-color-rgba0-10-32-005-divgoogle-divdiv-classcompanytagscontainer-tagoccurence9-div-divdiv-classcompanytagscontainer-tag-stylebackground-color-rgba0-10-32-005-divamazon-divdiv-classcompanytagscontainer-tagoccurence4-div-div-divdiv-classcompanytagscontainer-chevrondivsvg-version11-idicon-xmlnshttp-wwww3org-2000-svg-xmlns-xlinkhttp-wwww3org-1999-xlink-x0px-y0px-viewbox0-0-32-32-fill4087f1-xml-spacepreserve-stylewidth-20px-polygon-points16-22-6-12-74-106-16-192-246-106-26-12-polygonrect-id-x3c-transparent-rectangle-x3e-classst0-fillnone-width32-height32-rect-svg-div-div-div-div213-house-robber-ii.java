class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int startMoney = robLinear(nums, 0, nums.length - 2);
        int endMoney = robLinear(nums, 1, nums.length - 1);
        return Math.max(startMoney, endMoney);
    }
    
    private int robLinear(int[] nums, int start, int end) {
        int currentMax = 0;
        int previousMax = 0;
        for (int i = start; i <= end; i++) {
            int temp = currentMax;
            currentMax = Math.max(previousMax + nums[i], currentMax);
            previousMax = temp;
        }
        return currentMax;
    }
}
