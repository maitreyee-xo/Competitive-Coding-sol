class Solution {
    private List<Integer> res = new ArrayList<Integer>();
    private void search(TreeNode root){
        if(root == null) return;
        search(root.left);
        search(root.right);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        search(root);
        return res;
    }
}