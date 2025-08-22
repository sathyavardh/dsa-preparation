

//Approach - 1

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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        int mid = arr.length/2;

        for(int i=0; i<mid; i++){
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }

        return true;

    }
}

// Approach - 2

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
    public boolean isPalindrome(ListNode head) {

        // Find the middle element
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the second half of the LL

        ListNode prev = null;
        ListNode curr = slow;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        //Checking for Palindrom
        ListNode firstList = head;
        ListNode secondList = prev;

        while(secondList!=null){
            if(firstList.val!=secondList.val) return false;

            firstList = firstList.next;
            secondList = secondList.next;
        }

        return true;

    }
}

