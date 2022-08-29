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
        if(left == right) {
            return head;
        }
        ListNode curr = head;
        ListNode prev =  null;
        
        for(int i = 0; curr != null & i < left - 1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode firstPart = prev;
        ListNode lastPart = curr;
        ListNode temp = null;
        
        for(int i = 0; curr != null && i < right - left + 1; i++) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        if(firstPart != null) {
            firstPart.next = prev;
        } 
        else {
            head = prev;
        }
        
        lastPart.next = curr;
        
        return head;
    }
    
}