// Approach - 1 Lenthy part
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m=0;
        int n=0;

        ListNode pA = headA;
        ListNode pB = headB;

        //Step - 1 Calculate Length of A and B
        while(pA!=null){
            pA=pA.next;
            ++m;
        }

        while(pB!=null){
            pB=pB.next;
            ++n;
        }

        //Step - 2 Difference and match the pntr

        int diff = Math.abs(m-n);

        //I want to make - firstList as small and secondList as larger

        if(m>n){
            ListNode temp = headA;
            headA = headB;
            headB = temp;
        }

        for(int i=0; i<diff; i++){
            headB = headB.next;
        }

        //Step - 3 Find the intersection part
        while(headA!=headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;

    }
}

// Shorten Version

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode pA = headA;
        ListNode pB = headB;

        while(pA!=pB){
            pA = (pA==null)?headB:pA.next;
            pB = (pB==null)?headA:pB.next;
        }
        return pA;
    }
}