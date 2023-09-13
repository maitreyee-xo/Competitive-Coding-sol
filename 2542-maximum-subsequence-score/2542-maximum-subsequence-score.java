class Solution {
    private class pairInfo {
        int val1;
        int val2;

        public pairInfo(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        pairInfo[] nums = new pairInfo[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = new pairInfo(nums1[i], nums2[i]);
        }

        Arrays.sort(nums, (a, b) -> {
            if (a.val2 == b.val2) {
                return a.val1 - b.val1;
            }
            return a.val2 - b.val2;
        });

        long sumK = 0;
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = n - 1; i >= 0; --i) {
            int minVal = nums[i].val2;
            while (pq.size() > k - 1) {
                sumK -= pq.poll();
            }
            sumK += nums[i].val1;
            pq.add(nums[i].val1);
            if (pq.size() == k) {
                ans = Math.max(ans, sumK * minVal);
            }
        }
        return ans;
    }
}
