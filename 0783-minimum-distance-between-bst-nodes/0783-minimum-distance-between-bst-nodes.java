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
    int diff = Integer.MAX_VALUE;
    TreeNode prev;
    private void traverse(TreeNode root)
    {
        if(root == null) return;
        traverse(root.left);
        if(prev != null) diff = Math.min(diff, root.val - prev.val);
        prev = root;
        traverse(root.right);
    }
    public int minDiffInBST(TreeNode root) {
        traverse(root);
        return diff;
    }
}