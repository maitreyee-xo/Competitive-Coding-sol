class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)   return root;
        if (key < root.val) root.left = deleteNode(root.left, key);
        else if (key > root.val) root.right = deleteNode(root.right, key);
        else {
            // node with only one child or no child
            if (root.left == null) return root.right;
            else if (root.right == null)  return root.left;
            // node with two children; get the in-order successor
            root.val = findMinValue(root.right);
            // delete the in-order successor
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }
    private int findMinValue(TreeNode node) {
        int minValue = node.val;
        while (node.left != null) {
            minValue = node.left.val;
            node = node.left;
        }
        return minValue;
    }
}