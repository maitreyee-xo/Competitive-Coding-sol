class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0) return 1;
        Map<Integer, Integer> trusted = new HashMap<>();
        Set<Integer> theyTrust = new HashSet<>();
        
        for(int i = 0; i < trust.length; i++){
            trusted.put(trust[i][1], trusted.getOrDefault(trust[i][1],0)+1);
            theyTrust.add(trust[i][0]);
        }
        
        int judge = -1;
        for(Map.Entry<Integer, Integer> entry :trusted.entrySet()){
            if(entry.getValue() == n-1)
                judge = entry.getKey();
        }
        
        if(judge != -1 && !theyTrust.contains(judge))
            return judge;
        return -1;        
    }
}