class SeatManager {
    int nextSeat = 1;
    PriorityQueue<Integer> seats = new PriorityQueue<>();
    
    public SeatManager(int n) {
        
    }
    
    public int reserve() {
        return seats.isEmpty() ? nextSeat++ : seats.poll();
    }
    
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}
/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */