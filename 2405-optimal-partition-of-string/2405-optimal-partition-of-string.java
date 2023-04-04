class Solution {
    public int partitionString(String s) {
        boolean []arr = new boolean[26];
        Arrays.fill(arr,false);

        int i = 0,ans = 1;
        while(i<s.length()){
            int n = s.charAt(i)-'a';
            if(arr[n]==true){
                Arrays.fill(arr,false);
                ans++;
            }
            arr[n] = true;
            i++;
        }
        return ans;
    }
}