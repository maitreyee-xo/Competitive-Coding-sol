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
    List<TreeNode> dupe = new LinkedList<>();
    public String preorder(TreeNode current, List<TreeNode> dupe, Map<String, Integer> hm)
    {
        if(current == null) return "";
        String formed = current.val + "$";
        formed += preorder(current.left, dupe, hm) + "$";
        formed += preorder(current.right, dupe, hm);
        hm.put(formed, hm.getOrDefault(formed,0)+1);
        if(hm.get(formed) == 2) dupe.add(current);
        return formed;
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        preorder(root, dupe, new HashMap<>());
        return dupe;
    }
}