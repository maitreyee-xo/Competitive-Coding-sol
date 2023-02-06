//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    private boolean sorted(int nums[])
    {
        for(int i = 0; i < nums.length - 1;i++)
        {
            if(nums[i] > nums[i+1]) return false;
        }
        return true;
    }
    private void swap(int nums[], int i, int j, HashMap<Integer, Integer> hm)
    {
        hm.put(nums[j], i);
        hm.put(nums[i], j);
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int minSwaps(int nums[])
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        int index = 0;
        for(int i : nums)
        {
            arr.add(i);
            hm.put(i,index++);
        }
        Collections.sort(arr);
        int swaps = 0;
        for(int i = 0; i < nums.length;i++)
        {
            if(sorted(nums))
            {
                return swaps;
            }
            if(nums[i] != arr.get(i))
            {
                swap(nums,i,hm.get(arr.get(i)),hm);
                swaps++;
            }
        }
        return swaps;
    }
}