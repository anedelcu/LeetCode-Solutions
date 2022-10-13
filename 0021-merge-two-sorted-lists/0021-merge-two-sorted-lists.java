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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        
        minHeap.add(list1);
        minHeap.add(list2);
        
        ListNode resHead = null;
        ListNode resTail = null;
        while(!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if(resHead == null) {
                resHead = node;
                resTail = node;
            }
            else{
                resTail.next = node;
                resTail = resTail.next;
            }
            
            if(node.next != null) {
                minHeap.add(node.next);
            }
        }
        return resHead;
    }
}