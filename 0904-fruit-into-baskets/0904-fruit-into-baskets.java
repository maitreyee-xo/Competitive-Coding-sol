class Solution {
    public int totalFruit(int[] fruits) {
      HashMap<Integer, Integer> hm = new HashMap<>();
        int p2, p1 = 0;
        int maximum = 0;
        for(p2 = 0; p2< fruits.length;p2++)
        {
            hm.put(fruits[p2], hm.getOrDefault(fruits[p2], 0)+1);
            if(hm.size() > 2)
            {
                hm.put(fruits[p1], hm.get(fruits[p1]) - 1);
                if(hm.get(fruits[p1]) == 0)
                    hm.remove(fruits[p1]);
                p1++;
            }
                    maximum = Math.max(maximum, p2 - p1 + 1);

        }
        return maximum;
    }
}