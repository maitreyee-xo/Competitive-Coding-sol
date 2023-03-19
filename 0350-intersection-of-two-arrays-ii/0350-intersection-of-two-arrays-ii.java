class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> arr= new ArrayList<>();
        for(int i: nums1) hm.put(i, hm.getOrDefault(i, 0) + 1);
        for(int i : nums2)
        {
            if(hm.containsKey(i) && hm.get(i) > 0)
            {
                arr.add(i);
                hm.put(i, hm.get(i) - 1);
            }
        }
        int [] a = new int[arr.size()];
        for(int i = 0; i < arr.size();i++)
        {
            a[i] = arr.get(i);
        }
        return a;
    }
}