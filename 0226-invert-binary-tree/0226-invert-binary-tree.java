/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack <TreeNode> stk = new Stack<>();
    public TreeNode invertTree(TreeNode root) {
if(root==null) return root;
        stk.push(root);
        while(!stk.isEmpty())
        {
            TreeNode curr = stk.pop();
            if(curr.right != null) stk.push(curr.right);
            if(curr.left != null) stk.push(curr.left);
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
        }
        return root;
    }
}