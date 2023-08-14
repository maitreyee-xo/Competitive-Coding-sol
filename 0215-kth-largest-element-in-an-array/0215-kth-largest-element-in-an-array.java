class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : nums)  maxHeap.add(i);
        while (!maxHeap.isEmpty()) {
            --k;
            int x = maxHeap.poll();
            if(k == 0) return x;
        }
        return 0;
    }
}