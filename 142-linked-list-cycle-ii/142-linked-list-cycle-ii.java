/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int cycleLen = 0;
        ListNode slow = head;
        ListNode fast =head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                cycleLen = calculateLenght(slow);
                break;
            }
        }
        if(cycleLen == 0)
            return null;
        return findStart(head, cycleLen);
    }
    
    public static ListNode findStart(ListNode head, int cycleLen) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while(cycleLen > 0) {
            pointer2 = pointer2.next;
            cycleLen--;
        }
        while(pointer1 != pointer2) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return pointer1;
    }
    
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            if(slow == fast) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
    
    public static int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return calculateLenght(slow);
            }
        }
        return 0;
    }
    
    public static int calculateLenght(ListNode head) {
        ListNode curr = head;
        int cycleLen = 0;
        do{
            curr = curr.next;
            cycleLen++;
        } while(curr != head);
        
        return cycleLen;
    }
}