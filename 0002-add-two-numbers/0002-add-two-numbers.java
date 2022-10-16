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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode result = res;
        int carry = 0;
        while(l1 != null && l2 != null) {
            int value = l1.val + l2.val + carry;
            res.next = new ListNode(value % 10);
            if(value > 9) {
                carry = 1;
            }
            else {
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
            res = res.next;
        }
        while(l1 != null) {
            int value = l1.val % 10 + carry;
             res.next = new ListNode(value % 10);
            if(value > 9) {
                carry = 1;
            }
            else {
                carry = 0;
            }
            l1 = l1.next;
            res = res.next;
        }
        while(l2 != null) {
            int value = l2.val % 10 + carry;
            res.next = new ListNode( value % 10);
            if(value > 9) {
                carry = 1;
            }
            else {
                carry = 0;
            }
            l2 = l2.next;
            res = res.next;
        }
        if(carry == 1) {
            res.next = new ListNode(carry);
        }
        return result.next;
    }
}