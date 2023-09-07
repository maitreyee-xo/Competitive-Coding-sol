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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy;
        ListNode current = head;
        for(int i = 0; i < left - 1; i ++)
        {
            start = start.next;
            current = current.next;
        }
        ListNode startReversing = current;
        ListNode preNode = null;
        for(int i = 0; i <= right - left;i++)
        {
            ListNode nextNode = current.next;
            current.next = preNode;
            preNode = current;
            current = nextNode;
        }
        start.next = preNode;
        startReversing.next = current;
        return dummy.next;        
    }
}