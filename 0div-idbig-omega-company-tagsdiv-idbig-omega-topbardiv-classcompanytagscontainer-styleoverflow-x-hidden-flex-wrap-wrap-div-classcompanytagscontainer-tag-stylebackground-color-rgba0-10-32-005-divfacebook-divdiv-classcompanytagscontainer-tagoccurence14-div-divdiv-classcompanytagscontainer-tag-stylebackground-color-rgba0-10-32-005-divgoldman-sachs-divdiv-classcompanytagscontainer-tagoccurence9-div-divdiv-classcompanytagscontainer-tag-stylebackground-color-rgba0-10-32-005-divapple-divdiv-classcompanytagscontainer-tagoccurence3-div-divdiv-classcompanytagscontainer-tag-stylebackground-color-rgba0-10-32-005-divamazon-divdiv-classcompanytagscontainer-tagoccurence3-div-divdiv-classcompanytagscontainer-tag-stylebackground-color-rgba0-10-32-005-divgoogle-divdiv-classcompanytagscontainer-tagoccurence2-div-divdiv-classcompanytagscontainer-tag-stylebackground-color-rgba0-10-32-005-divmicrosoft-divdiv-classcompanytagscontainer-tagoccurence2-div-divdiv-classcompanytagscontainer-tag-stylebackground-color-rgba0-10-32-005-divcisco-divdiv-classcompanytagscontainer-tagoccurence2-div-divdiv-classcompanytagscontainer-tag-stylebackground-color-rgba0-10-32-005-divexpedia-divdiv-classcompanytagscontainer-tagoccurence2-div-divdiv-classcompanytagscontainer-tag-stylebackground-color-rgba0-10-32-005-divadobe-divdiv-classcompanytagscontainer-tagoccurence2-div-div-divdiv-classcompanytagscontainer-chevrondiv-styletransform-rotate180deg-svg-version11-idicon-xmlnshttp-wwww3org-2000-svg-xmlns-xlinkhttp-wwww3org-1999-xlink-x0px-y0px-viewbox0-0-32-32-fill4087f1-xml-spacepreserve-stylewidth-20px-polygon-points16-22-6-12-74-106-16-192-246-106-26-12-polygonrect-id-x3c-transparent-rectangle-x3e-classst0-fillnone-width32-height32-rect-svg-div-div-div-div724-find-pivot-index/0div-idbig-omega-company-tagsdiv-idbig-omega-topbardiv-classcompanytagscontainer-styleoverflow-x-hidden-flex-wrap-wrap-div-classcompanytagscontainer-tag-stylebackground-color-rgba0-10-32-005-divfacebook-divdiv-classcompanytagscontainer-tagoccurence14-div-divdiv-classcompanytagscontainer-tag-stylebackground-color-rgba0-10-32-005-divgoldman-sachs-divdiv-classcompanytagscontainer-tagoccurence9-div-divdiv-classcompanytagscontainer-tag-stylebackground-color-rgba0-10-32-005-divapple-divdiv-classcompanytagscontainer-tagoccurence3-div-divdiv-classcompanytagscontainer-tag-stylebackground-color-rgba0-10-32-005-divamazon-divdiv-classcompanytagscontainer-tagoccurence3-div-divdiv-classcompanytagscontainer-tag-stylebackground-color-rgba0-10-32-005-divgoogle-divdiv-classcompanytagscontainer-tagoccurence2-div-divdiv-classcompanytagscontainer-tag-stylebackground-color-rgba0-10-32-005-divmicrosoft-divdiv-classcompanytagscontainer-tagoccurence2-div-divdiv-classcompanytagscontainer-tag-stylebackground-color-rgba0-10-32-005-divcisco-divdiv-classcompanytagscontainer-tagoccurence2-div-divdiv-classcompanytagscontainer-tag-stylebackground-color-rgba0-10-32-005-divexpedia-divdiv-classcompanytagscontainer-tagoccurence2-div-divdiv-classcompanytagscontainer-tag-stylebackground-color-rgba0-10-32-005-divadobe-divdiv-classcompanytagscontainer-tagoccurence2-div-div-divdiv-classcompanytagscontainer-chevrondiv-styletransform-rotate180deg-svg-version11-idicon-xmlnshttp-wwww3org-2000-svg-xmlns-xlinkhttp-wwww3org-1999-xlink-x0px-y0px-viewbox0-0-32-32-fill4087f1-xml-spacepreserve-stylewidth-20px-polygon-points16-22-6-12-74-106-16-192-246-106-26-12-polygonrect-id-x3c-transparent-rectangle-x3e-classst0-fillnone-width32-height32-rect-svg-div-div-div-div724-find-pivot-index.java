class Solution {
    public int pivotIndex(int[] nums) {
        int pivotIndex = 0;
        int half1 = 0;
        int half2 = 0;
        while (pivotIndex < nums.length) {
            for (int i = 0; i < pivotIndex; i++)  half1 += nums[i];
            for (int i = pivotIndex + 1; i < nums.length; i++)   half2 += nums[i];
            if (half1 == half2) return pivotIndex;
            else {
                half1 = 0; 
                half2 = 0; 
                pivotIndex++;
            }
        }
        return -1;
    }
}
