//{ Driver Code Starts
import java.util.*;

class Find_abs_Max
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.max_val(arr,n));
			
		t--;
		}
	}
}
// } Driver Code Ends


/*The function returns an integer
which denotes the max value 
of abs(i â€“ j) * min(arr[i], arr[j]) 
in the array.
*/

class Solution
{
    /*You are required to complete this method*/
    int max_val(int arr[], int n)
    {
	int mul =0,maxVal=0;
	int lo =0, hi = n-1;
	while(lo < hi){
	    int x = Math.abs(lo-hi);
	        int y = Math.min(arr[lo],arr[hi]);
	        mul = x * y;
	        maxVal = Math.max(mul,maxVal);
	        if(arr[lo]<arr[hi]) lo++;
	        else  hi--;
	}
	return maxVal;
    }}