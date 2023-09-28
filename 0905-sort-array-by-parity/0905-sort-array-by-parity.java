class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0)   result[evenIndex++] = num; // Place even numbers at the beginning
            else   result[oddIndex--] = num; // Place odd numbers at the end
        }
        return result;
    }
}
