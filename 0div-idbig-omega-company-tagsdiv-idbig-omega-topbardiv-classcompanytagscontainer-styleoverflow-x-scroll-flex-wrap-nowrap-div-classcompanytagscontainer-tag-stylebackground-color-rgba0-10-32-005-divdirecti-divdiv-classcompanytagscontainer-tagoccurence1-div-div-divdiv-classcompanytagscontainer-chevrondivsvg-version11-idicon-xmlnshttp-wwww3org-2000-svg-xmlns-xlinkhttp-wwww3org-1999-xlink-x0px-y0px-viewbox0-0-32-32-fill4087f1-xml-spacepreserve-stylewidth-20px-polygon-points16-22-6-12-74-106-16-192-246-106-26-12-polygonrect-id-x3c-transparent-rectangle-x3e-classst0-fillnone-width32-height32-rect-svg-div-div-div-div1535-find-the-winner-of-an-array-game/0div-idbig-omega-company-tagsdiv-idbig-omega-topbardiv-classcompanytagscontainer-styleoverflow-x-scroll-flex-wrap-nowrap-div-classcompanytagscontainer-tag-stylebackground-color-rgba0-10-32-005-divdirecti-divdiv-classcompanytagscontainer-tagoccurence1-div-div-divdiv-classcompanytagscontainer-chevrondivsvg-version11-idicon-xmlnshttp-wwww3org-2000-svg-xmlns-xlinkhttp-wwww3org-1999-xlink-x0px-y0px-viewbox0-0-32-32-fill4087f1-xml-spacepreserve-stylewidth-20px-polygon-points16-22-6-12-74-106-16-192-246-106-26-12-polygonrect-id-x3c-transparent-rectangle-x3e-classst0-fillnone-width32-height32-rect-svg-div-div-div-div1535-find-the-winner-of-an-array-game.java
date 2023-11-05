class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        int count = 0;
        for(int i=1;i<arr.length&&count<k;i++) {
            if(max < arr[i]) {
                max = arr[i];
                count = 0;
            }
            count++;
        }
        return max;
    }
}