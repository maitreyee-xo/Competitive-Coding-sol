class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = m.get(s.charAt(i));
        }

        int integer = 0;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || nums[i] >= nums[i + 1])
                integer += nums[i];
            else
                integer -= nums[i];
        }
        return integer;
    }
}