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

//  Approach: 1 Iteration
class Solution {
    public ListNode swapPairs(ListNode head) {

        //Corner Case
        if(head==null || head.next==null) return head;

        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode p = dummy;
        ListNode c = head;
        ListNode n = head.next;

        while(c!=null && n!=null){
            p.next = n;
            c.next = n.next;
            n.next = c;

            p = c;
            c = p.next;
            n = (c!=null)?c.next:null;
        }

        return dummy.next;
    }
}

// Approach: 2 Recursion

class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode l = head;
        ListNode r = head.next;

        l.next = swapPairs(r.next);
        r.next = l;
        return r;
    }
}