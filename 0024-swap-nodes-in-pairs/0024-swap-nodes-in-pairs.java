class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (head != null && head.next != null) {
            ListNode odd = head;
            ListNode even = head.next;
            // Swapping adjacent nodes
            prev.next = even;
            odd.next = even.next;
            even.next = odd;
            // Move the pointers forward
            prev = odd;
            head = odd.next;
        }
        return dummy.next;
    }
}
