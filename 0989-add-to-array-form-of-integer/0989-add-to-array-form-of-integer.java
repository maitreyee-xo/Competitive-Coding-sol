class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        List<Integer> res = new ArrayList<>(); 
        int len = num.length - 1;
        while(carry > 0 || k > 0 || len >= 0)
        {
            int n = len>= 0 ? num[len--]:0;
            int a = k % 10;
            int sum = n + a + carry;
            res.add(sum % 10);
            carry = sum / 10;
            k /= 10; 
        }
        Collections.reverse(res);
        return res;
    }
}