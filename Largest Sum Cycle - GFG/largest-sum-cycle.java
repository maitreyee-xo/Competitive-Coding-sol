//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt();
            int Edge[] = new int[N];
            for(int i = 0; i < N; i++)
                Edge[i] = sc.nextInt();
            Solution ob = new Solution();
            long ans = ob.largesSumCycle(N, Edge);
            out.println(ans);            
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    long largest = -1;
    public long largesSumCycle(int N, int Edge[]){
        boolean[] visited = new boolean[N];
        boolean[] pathTraversed = new boolean[N];
        for(int i = 0; i < N;i++)
        {
            if(!visited[i]) { dfs(i, Edge,visited,pathTraversed);}
        }
        return largest;
    }
    void dfs(int node, int Edge[], boolean[] visited, boolean[] pathTraversed)
    {
        visited[node] = true;
        pathTraversed[node] = true;
        if(Edge[node] != -1)
        {
            int adjacent = Edge[node];
            if(!visited[adjacent]) { dfs(adjacent,Edge,visited,pathTraversed);}
            else if(pathTraversed[adjacent])
            {
                int current = adjacent;
                long sum = 0;
                do
                {
                    sum += current;
                    current = Edge[current];
                }
                while(current != adjacent);
                largest = Math.max(largest, sum);
            }
        }
        pathTraversed[node] = false;
    }
}