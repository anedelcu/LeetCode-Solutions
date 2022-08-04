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
    
    ListNode reverse(ListNode s){
        ListNode ans = null;
        
        while(s != null){
            ans = new ListNode(s.val, ans);
            s = s.next;
        }
        return ans;
    }
    
    ListNode add(ListNode s, ListNode t){
        
        int sum = 0, carry = 0;
        
        ListNode temp = new ListNode(0);
        ListNode ans = temp;
        
        while(s != null || t != null || carry != 0){
            
            sum = 0;
            
            if(s != null){
                sum += s.val; s = s.next;
            }
            if(t != null){
                sum += t.val; t = t.next;
            }
            
            sum += carry;
            carry = sum / 10;
            
            ListNode x = new ListNode(sum%10);
            temp.next = x;
            temp = temp.next;
        }
        return ans.next;
    }
     
    public ListNode addTwoNumbers(ListNode s, ListNode t) {
        ListNode one = reverse(s);
        ListNode two = reverse(t);
        
        ListNode ans = add(one, two);
        
        return reverse(ans);
    }
}