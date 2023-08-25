class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }    
    public int dfs(TreeNode node, int maxValueSoFar) {
        if (node == null)   return 0;       
        int goodNodes = 0;        
        if (node.val >= maxValueSoFar) {
            goodNodes++;
            maxValueSoFar = node.val;
        }        
        goodNodes += dfs(node.left, maxValueSoFar);
        goodNodes += dfs(node.right, maxValueSoFar);        
        return goodNodes;
    }
}