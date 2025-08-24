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

//  Two Pass - Traversing LL Two Times
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sentinel = new ListNode();
        sentinel.next = head;

        int cnt = 0;

        //Calculate Count of LinkedList
        while(head!=null){
            head = head.next;
            cnt++;
        }

        int prevPos = cnt-n;
        ListNode prev = sentinel;

        //Traverse to the previous position
        for(int i=0; i<prevPos; i++){
            prev = prev.next;
        }

        //Delete the nth node from the rev order

        prev.next = prev.next.next;

        return sentinel.next;
    }
}