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
    private Map<Integer, List<TreeNode>> hm = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
     if (n % 2 == 0) return new ArrayList<TreeNode>();
        if (n == 1) return Arrays.asList(new TreeNode());
        if (hm.containsKey(n)) return hm.get(n);
        List<TreeNode> res = new ArrayList< TreeNode>();
        for(int i = 1; i < n;i += 2)
        {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);
            for(TreeNode l : left)
            {
                for(TreeNode r : right)
                {
                    TreeNode root = new TreeNode(0, l, r);
                    res.add(root);
                }
            }
        }
        hm.put(n, res);
        return res;
    }
}