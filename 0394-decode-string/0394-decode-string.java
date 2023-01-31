class Solution {
    public String decodeString(String s) {
        Stack<String> wordstk = new Stack<String>();
        Stack<Integer> intstk = new Stack<Integer>();
        StringBuilder temp = new StringBuilder();
        int number = 0;
        for(int i = 0; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            { 
              number = number * 10 + (c - '0');  
            }
            else if(Character.isLetter(c))
            {
                temp.append(c);
            }
            else if(c == '[')
            {
                intstk.add(number);
                wordstk.add(temp.toString());
                number = 0;
                temp = new StringBuilder();
            }
            else
            {
                int count = intstk.pop();
                StringBuilder dupe = new StringBuilder(wordstk.pop());
                for(int j = 1; j <= count;j++)
                {
                    dupe.append(temp);
                }
                temp = dupe;
            }
        }
        return temp.toString();
    }
}