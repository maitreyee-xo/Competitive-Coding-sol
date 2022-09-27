class Solution {
    public List<String> letterCombinations(String digits) {
        Map <Character,String> mapping = new HashMap();
        mapping.put('0', "");
        mapping.put('1', "");
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");

        if(digits.length() == 0)
        {
            return new ArrayList<String>();
        }
        StringBuilder sb = new StringBuilder();
        ArrayList <String> ar = new ArrayList<String>();
        dfs(sb,0,digits,mapping,ar);
        return ar;
    }
    private void dfs(StringBuilder sb, int index, String digits, Map<Character, String> mapping, ArrayList<String> ar)
    {
        if (index == digits.length()) {
            ar.add(sb.toString());
            return;
        }
        char dig = digits.charAt(index);
        String ans = mapping.getOrDefault(dig, dig + "");
        for(char x : ans.toCharArray())
        {
            sb.append(x);
            dfs(sb, index + 1, digits, mapping, ar);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}