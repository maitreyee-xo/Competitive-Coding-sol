class Solution {
    public long[] sumOfThree(long num) {
        long[] res = new long[3];
        if(num % 3 != 0) return new long[0];
        else{
            res[0] = num / 3 - 1;
            res[1] = num / 3;
            res[2] = num / 3 + 1;
        }
        return res;
    }
}
