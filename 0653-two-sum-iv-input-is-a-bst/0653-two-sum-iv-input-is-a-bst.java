public class Solution {
    Map<Integer, Integer> result = new HashMap<>();

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        result.put(root.val, result.getOrDefault(root.val, 0) + 1);
        inOrderTraversal(root.right);
    }

    public boolean findTarget(TreeNode root, int k) {
        inOrderTraversal(root);
        
        for (Integer value : result.keySet()) {
            int complement = k - value;
            if (result.containsKey(complement)) {
                if (complement == value && result.get(complement) < 2) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}