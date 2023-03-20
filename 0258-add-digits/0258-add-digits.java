class Solution {
    public int addDigits(int num) {
        int total = 0;
        int numb = num;
        if(num == 0) return 0;
        while(num > 0)
        {
            int remainder = num % 10;
            total += remainder;
            num /= 10;
        }
        numb = total;
        if(numb < 10) return numb;
        else return addDigits(numb);
    }
}