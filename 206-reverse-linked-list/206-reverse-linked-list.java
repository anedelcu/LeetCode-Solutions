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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode reverse = new ListNode(head.val);
        head = head.next;
        
        while(head != null) {
            ListNode newNode = new ListNode(head.val);
            newNode.next = reverse;
            reverse = newNode;
            head = head.next;
        }
        return reverse;
    }
}