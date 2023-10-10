class Solution {
    public int minOperations(int[] nums) {
        int ans = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums) hs.add(i);
        Integer [] newNums = hs.toArray(new Integer[hs.size()]);
        int[] primitiveIntArray = Arrays.stream(newNums).mapToInt(Integer::intValue).toArray();
        int idx = 0;
        for(int i : hs) primitiveIntArray[idx++] = i;
        Arrays.sort(primitiveIntArray);
        for(int i = 0; i < primitiveIntArray.length;i++)
        {
            int left = primitiveIntArray[i];
            int right = left + nums.length - 1;
            int j = binarySearch(primitiveIntArray, right);
            int count = j - i;
            ans = Math.min(ans, nums.length - count);
        }
        return ans;

    }
   public int binarySearch(int[] primitiveIntArray, int target) {
        int left = 0;
        int right = primitiveIntArray.length;        
        while (left < right) {
            int mid = (left + right) / 2;
            if (target < primitiveIntArray[mid]) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}