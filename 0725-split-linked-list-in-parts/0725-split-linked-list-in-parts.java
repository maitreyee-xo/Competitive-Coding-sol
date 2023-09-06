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
    public ListNode[] splitListToParts(ListNode head, int k) {
        // First, calculate the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Calculate the size of each part and any extra nodes
        int partSize = length / k;
        int extraNodes = length % k;

        // Initialize the result array
        ListNode[] result = new ListNode[k];

        // Reset the current pointer to the head
        current = head;

        // Split the list into k parts
        for (int i = 0; i < k && current != null; i++) {
            result[i] = current; // Set the start of the current part
            int partLength = partSize + (i < extraNodes ? 1 : 0); // Calculate part length
            for (int j = 0; j < partLength - 1; j++) {
                current = current.next; // Move to the end of the current part
            }
            ListNode temp = current.next; // Store the next node
            current.next = null; // Disconnect the current part from the rest of the list
            current = temp; // Move to the next part
        }

        return result;
    }
}