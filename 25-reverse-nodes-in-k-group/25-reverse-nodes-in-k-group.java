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
    public ListNode reverseKGroup(ListNode head, int k) {
        if( k <= 1 || head == null) {
            return head;
        }
        
        ListNode curr = head;
        ListNode prev = null;
        int size = 0;
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        for(int index = 0; index < size / k; index++) {
            ListNode start = prev;
            ListNode end = curr;
            ListNode temp = null;
            
            for(int  i = 0; curr != null && i < k; i++) {
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            
            if(start != null) {
                start.next = prev;
            }
            else {
                head = prev;
            }
            end.next = curr;
            
            if(curr == null) {
                break;
            }
            prev = end;
        }
        return head;
    }
}