class Solution {
    public double myPow(double x, int n) {
            if(n==0)
            return 1;
            if(x == 0 || x == 1 || n == 1)
            return x;
            double res = x;
            res = myPow(x,n/2);
            if(n % 2 == 0)
            return res * res;
            else 
            {
            if(n > 0)
                return x * res * res;
            else
                return res * res / x;
            }
          
    }
}