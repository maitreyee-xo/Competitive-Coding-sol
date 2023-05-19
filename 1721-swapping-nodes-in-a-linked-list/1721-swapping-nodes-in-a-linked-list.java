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
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        List<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null)
        {
            arr.add(temp);
            temp = temp.next;
        }
        int temporary = arr.get(k - 1).val;
        arr.get(k - 1).val = arr.get(arr.size() - k).val;
        arr.get(arr.size() - k).val = temporary;
        return head;
        
    }
}