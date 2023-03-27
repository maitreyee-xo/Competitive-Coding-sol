class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        Stack<Integer> stk = new Stack<>();
        int num = x;
        while(num > 0)
        {
            stk.push(num % 10);
            num /= 10;
        }
        num = x;
        while(!stk.isEmpty())
        {
            if(num % 10 != stk.pop()) return false;
            num /= 10;
        }
        return true;
    }
}