class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(Math.abs(fy - sy) == 0 && Math.abs(fx - sx) == 0 && t == 1)   return false;
        return t >= Math.max(Math.abs(fy - sy), Math.abs(fx - sx));
    }
}