/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        if(root== null) return preOrder;
        Stack<Node> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty())
        {
            Node temp = stk.peek();
            stk.pop();
            preOrder.add(temp.val);
            for(int i = temp.children.size() - 1; i>= 0;i--) stk.push(temp.children.get(i));
        }
        return preOrder;
    }
}