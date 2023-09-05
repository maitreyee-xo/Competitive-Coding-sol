class Solution {
    public String reverseStr(String s, int k) {
        char[] sch = s.toCharArray();
        for (int i = 0; i < sch.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, sch.length - 1); 
            while (left < right) {
                char temp = sch[left];
                sch[left] = sch[right];
                sch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(sch);
    }
}
