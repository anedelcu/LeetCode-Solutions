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
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l1rv = reverse(l1);
        ListNode l2rv = reverse(l2);
        int remainder = 0;
        Stack<Integer> s1 = new Stack<>();
        while (l1rv != null && l2rv != null) {
            if(l1rv.val + l2rv.val + remainder > 9) {
                s1.add(l1rv.val + l2rv.val + remainder - 10);
                remainder = 1;
            }
            else {
                s1.add(l1rv.val + l2rv.val + remainder);
                remainder = 0;
            }
            l1rv = l1rv.next;
            l2rv = l2rv.next;

        }

        while (l1rv != null) {
            if(l1rv.val + remainder > 9) {
                s1.add(l1rv.val + remainder - 10);
                remainder = 1;
            }else {
                s1.add(l1rv.val + remainder);
                remainder = 0;
            }
            l1rv = l1rv.next;
        }

        while (l2rv != null) {
            if(l2rv.val + remainder > 9) {
                s1.add(l2rv.val + remainder - 10);
                remainder = 1;
            }else {
                s1.add(l2rv.val + remainder);
                remainder = 0;
            }
            l2rv = l2rv.next;
        }
if (remainder == 1) {
            s1.add(1);
        }
        System.out.println(s1);
        ListNode res = null;
        while (!s1.isEmpty()) {
            res = new ListNode(s1.pop(), res);
            //res = res.next;
        }
        
        //printListNode(reverse(res));
        return reverse(res);
    }
    
    public static ListNode reverse(ListNode l){
        ListNode ans = null;

        while(l != null){
            ans = new ListNode(l.val, ans);
            l = l.next;
        }
        return ans;
    }
}