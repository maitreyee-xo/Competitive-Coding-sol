class SmallestInfiniteSet {
    private PriorityQueue<Integer> pq;
    private Set<Integer> seen;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        seen = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            pq.add(i + 1);
            seen.add(i + 1);
        }
    }

    public int popSmallest() {
        if (!pq.isEmpty()) {
            int smallest = pq.poll();
            seen.remove(smallest);
            return smallest;
        }
        return -1; //empty set enc.
    }

    public void addBack(int num) {
        if (!seen.contains(num)) {
            pq.add(num);
            seen.add(num);
        }
    }
}