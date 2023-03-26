class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> hm = 
            new HashMap<Character, Character>();

        hm.put(')', '(');
        hm.put(']', '[');
        hm.put('}', '{');

        for (Character c : s.toCharArray()) {
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty() || stack.pop() != hm.get(c)) {
                        return false;
                    }
            }
        }

        return stack.isEmpty();
    }
}