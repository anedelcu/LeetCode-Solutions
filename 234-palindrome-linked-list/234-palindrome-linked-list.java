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
    public boolean isPalindrome(ListNode head) {
     
        ListNode rev = reverse(head);
        while(head != null && rev != null) {
            System.out.println("head.val = " + head.val);
            System.out.println("reverse.val = " + rev.val);
            if(head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode reverse = null;
        while(head != null) {
            reverse = new ListNode(head.val, reverse);
            head = head.next;
        }
        return reverse;
    }
}