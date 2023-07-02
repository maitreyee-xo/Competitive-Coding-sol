class Solution {
    int ans = 0;
    void maximumRequests(int[][] requests, int[] inDegree, int n, int index, int count)
    {
        if(index == requests.length)
        {
            for(int i = 0; i < n;i++)
            {
                if(inDegree[i] != 0) return;
            }
        ans = Math.max(ans, count);
        return;
    }
        inDegree[requests[index][0]]--;
        inDegree[requests[index][1]]++;
        maximumRequests(requests,inDegree, n, index+1, count+1);
        inDegree[requests[index][0]]++;
        inDegree[requests[index][1]]--;
        maximumRequests(requests,inDegree, n, index+1, count);}
    public int maximumRequests(int n, int[][] requests) {
        int [] inDegree = new int[n];
        maximumRequests(requests, inDegree, n, 0, 0);
        return ans;
    }
}