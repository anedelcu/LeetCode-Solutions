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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        int i = 1;
        
        ListNode oddHead = new ListNode(0);
        ListNode odd = oddHead;
        ListNode evenHead = new ListNode(0);
        ListNode even = evenHead;
        
        while(head != null) {
            if(i % 2 != 0) {
                odd.next = head;
                odd = odd.next;
            }
            else {
                even.next = head;
                even = even.next;
            }
            head = head.next;
            i++;
        }
        odd.next = evenHead.next;
        even.next = null;
        return oddHead.next;
    }
}