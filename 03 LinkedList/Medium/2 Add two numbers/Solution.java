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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum =0;
        int carry =0; //quotient /10
        int digit =0; //remainder %10

        ListNode ans = new ListNode();
        ListNode ansHead = ans;

        while(l1!=null || l2!=null || carry!=0){
            sum = ((l1==null)?0:l1.val) + ((l2==null)?0:l2.val) + carry;
            carry = sum/10;
            digit = sum%10;

            ListNode newNode = new ListNode(digit);
            ans.next = newNode;
            ans = ans.next;

            l1 = (l1==null)?null:l1.next;
            l2 = (l2==null)?null:l2.next;
        }

        return ansHead.next;
    }
}