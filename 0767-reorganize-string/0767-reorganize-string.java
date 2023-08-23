class Solution {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray())  hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> {
            if (hm.get(a).equals(hm.get(b)))  return a - b; 
            return hm.get(b) - hm.get(a); 
        });
        for (char ch : hm.keySet())   pq.offer(ch);
        StringBuilder result = new StringBuilder();
        while (pq.size() >= 2) {
            char first = pq.poll();
            char second = pq.poll();            
            result.append(first);
            result.append(second);

            hm.put(first, hm.get(first) - 1);
            hm.put(second, hm.get(second) - 1);
            if (hm.get(first) > 0)    pq.offer(first);
            if (hm.get(second) > 0)  pq.offer(second);
        }
        if (!pq.isEmpty()) {
            char lastChar = pq.poll();
            if (hm.get(lastChar) == 1)   result.append(lastChar);
            else  return "";
        }
        
        return result.toString();
    }
}