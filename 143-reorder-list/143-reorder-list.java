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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode p1 = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode firstPart = null;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            firstPart = slow;
            slow = slow.next;
        }
        firstPart.next = null;
        ListNode p2 = reverse(slow);
        merge(p1, p2);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    private void merge(ListNode l1, ListNode l2) {
        while(l1 != null) {
            ListNode temp1 = l1.next;
            ListNode temp2 = l2.next;
            
            l1.next = l2;
            if(temp1 == null) {
                break;
            }
            l2.next = temp1;;
            l1 = temp1;
            l2 = temp2;
        }
    }
}