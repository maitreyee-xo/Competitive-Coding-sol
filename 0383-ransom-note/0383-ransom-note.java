class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     Map<Character,Integer> map1=new HashMap<>();
     for(int i=0;i<magazine.length();i++){
        if(map1.containsKey(magazine.charAt(i))){
            map1.put(magazine.charAt(i),map1.get(magazine.charAt(i))+1);
        }else{
            map1.put(magazine.charAt(i),1);
        }
    }
   
    for(int i=0;i<ransomNote.length();i++){
        if(map1.containsKey(ransomNote.charAt(i))){
            if(map1.get(ransomNote.charAt(i))==0)return false;
            else
             map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))-1);
        }else{
            return false;
        }
    }
    return true;
}}