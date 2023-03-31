class Solution {
public int calculate(String s) {
        int num = 0;
        char op = '+';
        ArrayDeque<Integer> operands = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if (c == ' ')
                continue;
            else if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
                continue;
            }
            exec(operands, op, num);
            
            op = c;
            num = 0;
        }
        exec(operands, op, num);
        num = 0;
        
        while(!operands.isEmpty())
            num += operands.pop();
        
        return num;
    }
    
    private void exec(ArrayDeque<Integer> operands, char operator, int operand) {
        if (operator == '+') operands.push(operand);
        else if (operator == '-') operands.push(-operand);
        else if (operator == '*') operands.push(operands.pop() * operand);
        else if (operator == '/') operands.push(operands.pop() / operand);
    }
}