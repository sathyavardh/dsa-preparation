/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode listB = headB;
        ListNode listA = headA;

        Set visited = new HashSet<>();

        //put all nodes of headB inside a set visited
        while(listB!=null){
            visited.add(listB);
            listB = listB.next;
        }

        //check for each element of headA there are present in set
        while(listA!=null){
            if(visited.contains(listA)){
                return listA;
            }
            listA = listA.next;
        }
        return null;
           
    }
}