class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        int dp[][] = new int[s.length()+1][s.length()+1]; 
        int startIndex=0, endIndex =0; // storing result index 
        //fill diagonal by 1, base condtion - for 1 length substring, as subst(0,0), subtrt(1,1) will always be palindrome
        for(int index=0; index < s.length(); index++){
            dp[index][index] =1; //as row/col will be same 
        }
        
        //filling one more base cond. for 2 length substring 
        for(int index=1; index < s.length(); index++){
            if(s.charAt(index-1) == s.charAt(index)){
                dp[index-1][index] = 1; 
                startIndex = index-1; endIndex = index;
            }
        }                      
        //imp conndition , if matching start/end index & inner substring check in dp , if matches then substring 
       int maxPalindromelength =0;   
        for(int end =2; end < s.length(); end ++){ //start checking for 3 length string . check all length substr start from 0->2 , 0->3
         for(int start=0; start < s.length(); start++){ //it's checking 0->2 , 1->2 etc. .. basically check for all substr 
                if(s.charAt(start) ==   s.charAt(end) && dp[start+1][end-1] ==1 ) { //imp cond- check outer layer & inner layer in dp itself                  
                    dp[start][end] = 1; // if matching , add this also in dp . 
                    
                    if( (end-start) > maxPalindromelength) { //key point // had mistake here missed condtion . 
                        startIndex = start; endIndex = end; 
                    }
                    maxPalindromelength = Math.max(maxPalindromelength , end-start);
                }
            }
        }           
        return s.substring(startIndex, endIndex+1); //+1 as 2nd param is exclusive 
    }
}