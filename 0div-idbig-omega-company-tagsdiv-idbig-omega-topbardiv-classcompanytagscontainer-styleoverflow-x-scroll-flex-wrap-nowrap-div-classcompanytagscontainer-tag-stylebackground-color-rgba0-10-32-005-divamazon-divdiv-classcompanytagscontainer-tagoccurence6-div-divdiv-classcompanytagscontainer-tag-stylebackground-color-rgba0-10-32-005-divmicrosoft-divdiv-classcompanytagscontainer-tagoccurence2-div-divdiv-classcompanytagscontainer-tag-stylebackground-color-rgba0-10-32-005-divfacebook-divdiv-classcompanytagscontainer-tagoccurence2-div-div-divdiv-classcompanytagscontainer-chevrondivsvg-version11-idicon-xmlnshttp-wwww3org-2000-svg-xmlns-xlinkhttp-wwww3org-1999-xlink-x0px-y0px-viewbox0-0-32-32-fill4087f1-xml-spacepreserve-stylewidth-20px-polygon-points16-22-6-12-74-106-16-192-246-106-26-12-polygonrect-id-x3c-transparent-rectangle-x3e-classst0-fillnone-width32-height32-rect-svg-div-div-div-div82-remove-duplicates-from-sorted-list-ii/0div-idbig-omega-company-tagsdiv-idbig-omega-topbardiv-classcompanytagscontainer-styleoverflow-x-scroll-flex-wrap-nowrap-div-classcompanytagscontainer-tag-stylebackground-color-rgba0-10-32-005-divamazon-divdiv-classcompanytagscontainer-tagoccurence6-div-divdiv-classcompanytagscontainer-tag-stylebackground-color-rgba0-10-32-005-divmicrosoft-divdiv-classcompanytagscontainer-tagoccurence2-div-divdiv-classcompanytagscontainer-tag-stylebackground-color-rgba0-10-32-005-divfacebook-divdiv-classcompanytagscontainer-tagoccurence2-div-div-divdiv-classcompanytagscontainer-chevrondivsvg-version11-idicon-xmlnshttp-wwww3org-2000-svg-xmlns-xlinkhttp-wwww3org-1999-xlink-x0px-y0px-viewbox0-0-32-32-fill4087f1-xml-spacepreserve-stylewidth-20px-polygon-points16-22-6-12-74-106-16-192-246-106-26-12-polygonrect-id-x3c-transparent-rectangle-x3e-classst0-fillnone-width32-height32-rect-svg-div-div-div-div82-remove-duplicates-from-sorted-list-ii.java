class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)    return head;         
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            boolean isDuplicate = false;
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
                isDuplicate = true;
            }
            if (isDuplicate)   prev.next = curr.next; 
            else  prev = curr;
            curr = curr.next; 
        }
        return dummy.next;
    }
}
