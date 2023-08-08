class Solution {
    public int search(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        int k = findPivot(nums);
        if (k == 0 || target < nums[0])  return binarySearch(nums, target, k, hi);
        else return binarySearch(nums, target, lo, k - 1);
    }
    private int findPivot(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;            
            if (nums[mid] > nums[hi])   lo = mid + 1;
            else hi = mid;
        }        
        return lo;
    }
    private int binarySearch(int[] nums, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target)  return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
