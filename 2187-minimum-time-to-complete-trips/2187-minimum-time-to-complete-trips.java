class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo = Long.MAX_VALUE, hi = 0, min = Long.MAX_VALUE;
        for(int t : time)
        {
            lo = Math.min(lo, t);
            min = Math.min(min, t);
        }
        hi = totalTrips * min;
        while(lo < hi)       
        {
            long mid = lo + (hi - lo)/2;
            if(blackbox(mid, totalTrips, time)) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    public boolean blackbox(long isvalidTime, int totalTrips, int [] time)
    {
        long trips = 0;
        for(int t : time) trips += isvalidTime/t;
        if(trips >= totalTrips) return true;
        return false;
    }
}