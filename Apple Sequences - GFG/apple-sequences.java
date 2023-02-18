//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            String arr = read.readLine().trim();

            Solution ob = new Solution();
            out.println(ob.appleSequence(N, M, arr));
        }
        out.close();
    }
}


// } Driver Code Ends
//User function Template for Java


class Solution{
    public static int appleSequence(int n, int m, String arr){
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        int length = 0;
        int p1 = 0;
        for(int i = 0; i < n;i++)
        {
            if(arr.charAt(i) == 'O')
            {
                list.add(i);
                if(m == 0)
                {
                    p1++;
                    m = 1;
                }
                m--;
            }
            length = Math.max(length, i - list.get(p1));
        }
        return length;
    }
}


//{ Driver Code Starts.

// } Driver Code Ends