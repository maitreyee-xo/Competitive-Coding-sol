class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int currentMax = 0; 
        int previousMax = 0; 
        for (int num : nums) {
            int temp = currentMax;
            currentMax = Math.max(previousMax + num, currentMax);
            previousMax = temp;
        }
        return currentMax;
    }
}