/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    TreeNode sortedArrayToBST(ArrayList<Integer> arr, int left, int right)
    {
        if (left > right)    return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(arr.get(mid));
        node.left = sortedArrayToBST(arr, left, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, right);
        return node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int len= 0;
        while(head !=null) 
        {
            arr.add(head.val);
            head = head.next;
            len++;
        }
        TreeNode tree = sortedArrayToBST(arr, 0, len-1);
        return tree;
    }
}