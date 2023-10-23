class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        return Math.floor(Math.log(n) / Math.log(4.0)) == Math.log(n) / Math.log(4.0);
    }
}