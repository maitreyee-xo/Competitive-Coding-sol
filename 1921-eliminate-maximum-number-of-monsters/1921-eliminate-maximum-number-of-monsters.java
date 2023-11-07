class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int ans = 0;
        int[] time = new int[dist.length];
        for(int i = 0; i < dist.length;i++) time[i] = (int)Math.ceil((double)dist[i]/speed[i]);
        Arrays.sort(time);
        for(int i = 0; i < dist.length;i++)
        {
            if(i >= time[i]) return i;
            ans++;
        }
        return ans;
    }
}