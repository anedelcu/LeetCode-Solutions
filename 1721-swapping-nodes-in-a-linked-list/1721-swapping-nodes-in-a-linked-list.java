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
    public ListNode swapNodes(ListNode head, int k) {
        k = k - 1;
        ListNode first = head;
        while(k > 0) {
            first =first.next;
            k--;
        }
        
        ListNode curr = first;
        ListNode second = head;
        while(curr.next != null) {
            second = second.next;
            curr = curr.next;
        }
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
    }
}