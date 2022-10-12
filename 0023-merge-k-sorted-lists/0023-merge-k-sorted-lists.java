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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.val - n2.val);
        
        // put the root of each list in the minHeap
        for(ListNode root : lists) {
            if(root != null) {
                minHeap.add(root);
            }
        }
        
        // take the smallest (top) element from the min heap adn add it to the result
        // if the top element has next element add it to the heap
        
        ListNode resultHead = null;
        ListNode resultTail = null;
        
        while(!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            if(resultHead == null) {
                resultHead = node;
                resultTail = node;
            }
            else {
                resultTail.next = node;
                resultTail = resultTail.next;
            }
            
            if(node.next != null) {
                minHeap.add(node.next);
            }
        }
        return resultHead;
        
    }
}