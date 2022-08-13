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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }
        
        int count = 0;
        while(head != null) {
            
            boolean flag = false;
            while(head != null && set.contains(head.val)) {
                flag = true;
                head = head.next;
            }
            if(flag == true){
                count++;
            }
            if(head != null){
                head = head.next;
            }
        }
        return count;  
    }
}
