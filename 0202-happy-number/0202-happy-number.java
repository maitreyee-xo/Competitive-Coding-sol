class Solution {
	public boolean isHappy(int n) {
	   if (n<7 && n>1)  return false;
		int squareSum = 0;
		if (n == 1)  return true;           
		while (n > 0) {
			int rem = n % 10;               
			squareSum += (rem * rem);   
			n /= 10;                    
		}
		return isHappy(squareSum);    
	}
}