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

//  Approach - 1
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null) return head;

        ListNode curr = head;

        int length = 0;

        // Calculate the Length for headList
        while(curr!=null){
            curr = curr.next;
            length++;
        }

        //To avoid unnecessary rotation
        int shift = k%length;

        ListNode firstPtr = head;
        ListNode secondPtr = head;

        //Move firstPtr k steps ahead
        for(int i=0; i<shift; i++){
            firstPtr = firstPtr.next;
        }

        //Reaching the end of the list
        while(firstPtr.next!=null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        firstPtr.next = head;
        ListNode newHead = secondPtr.next;
        secondPtr.next = null;

        return newHead;

    }
}

//Approach - 2

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // Step 1: Find length and tail
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: Make it circular
        curr.next = head;

        // Step 3: Calculate steps to reach new tail
        int shift = k % length;
        int stepsToNewTail = length - shift - 1;

        // Step 4: Move to new tail
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 5: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
