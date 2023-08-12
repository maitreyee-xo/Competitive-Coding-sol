class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();       
        for (int i : nums) if (i % 2 == 0)  hm.put(i, hm.getOrDefault(i, 0) + 1);        
        int maxFrequency = 0;
        int elementWithMaxFrequency = -1;        
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                elementWithMaxFrequency = entry.getKey();
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();            
            if (frequency == maxFrequency && element < elementWithMaxFrequency)  elementWithMaxFrequency = element;
        }        
        return elementWithMaxFrequency;
    }
}
