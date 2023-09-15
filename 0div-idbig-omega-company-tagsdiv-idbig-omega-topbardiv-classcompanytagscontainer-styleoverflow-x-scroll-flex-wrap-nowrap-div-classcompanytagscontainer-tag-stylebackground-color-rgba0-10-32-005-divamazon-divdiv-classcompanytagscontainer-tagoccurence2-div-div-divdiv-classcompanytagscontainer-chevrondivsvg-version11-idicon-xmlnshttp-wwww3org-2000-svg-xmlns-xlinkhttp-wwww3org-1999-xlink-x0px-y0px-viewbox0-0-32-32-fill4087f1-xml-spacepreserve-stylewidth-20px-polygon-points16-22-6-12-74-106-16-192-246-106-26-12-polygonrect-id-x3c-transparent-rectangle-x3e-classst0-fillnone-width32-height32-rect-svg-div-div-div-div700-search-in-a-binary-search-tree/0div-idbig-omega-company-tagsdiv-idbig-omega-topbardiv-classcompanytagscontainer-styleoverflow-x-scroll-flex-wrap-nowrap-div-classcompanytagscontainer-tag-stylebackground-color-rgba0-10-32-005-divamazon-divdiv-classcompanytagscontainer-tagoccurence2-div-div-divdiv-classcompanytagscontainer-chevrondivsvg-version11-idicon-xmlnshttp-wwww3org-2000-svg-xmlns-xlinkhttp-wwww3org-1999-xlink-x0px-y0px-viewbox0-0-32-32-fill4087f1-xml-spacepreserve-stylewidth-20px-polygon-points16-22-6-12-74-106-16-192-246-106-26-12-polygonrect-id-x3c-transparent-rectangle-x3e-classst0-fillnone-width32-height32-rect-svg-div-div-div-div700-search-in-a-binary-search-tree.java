class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return helper(root, val);
    }    
    public TreeNode helper(TreeNode node, int val) {
        if (node == null || node.val == val) return node;       
        if (val < node.val) return helper(node.left, val);
            else return helper(node.right, val);
    }
}
