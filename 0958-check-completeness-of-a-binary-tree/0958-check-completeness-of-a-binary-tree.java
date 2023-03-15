class Solution {
    public boolean isCompleteTree(TreeNode root) {
      Queue<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(queue.peek()!=null){
          TreeNode node=queue.poll();
          queue.add(node.left);
          queue.add(node.right);
      }
      while(!queue.isEmpty() && queue.peek()==null) queue.poll();
     return queue.isEmpty();
    }
}