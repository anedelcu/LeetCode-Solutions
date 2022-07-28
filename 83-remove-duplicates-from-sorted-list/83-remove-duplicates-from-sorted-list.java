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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null){
            return null;
        }
        
        ListNode list = head;
        while(list.next != null){
            if(list.val == list.next.val) {
                ListNode temp = list.next;
                list.next = temp.next;
            }
            else{
                list = list.next;
            }

        }
    return head;
    }
}