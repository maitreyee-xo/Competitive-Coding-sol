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
    int sum = 0;
    String s = "";
    private void traverse(TreeNode root,String s)
    {
        if(root == null) return;
        s += root.val;
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(s);
            return;
        }
        traverse(root.left, s);
        traverse(root.right, s);
    }
    public int sumNumbers(TreeNode root) {
        traverse(root, s);
        return sum;
    }
}