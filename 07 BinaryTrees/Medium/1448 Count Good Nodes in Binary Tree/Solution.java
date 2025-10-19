/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        int[] ans = new int[1];
        traversal(root, ans, Integer.MIN_VALUE);  
        return ans[0];
    }
    public void traversal(TreeNode curr, int[] ans, int maxSeenSoFar){
        if(curr==null) return;
        if(curr.val>=maxSeenSoFar){
            ++ans[0];
        }
        int currMax = Math.max(maxSeenSoFar, curr.val);
        traversal(curr.left, ans, currMax);
        traversal(curr.right, ans, currMax);
    }
}