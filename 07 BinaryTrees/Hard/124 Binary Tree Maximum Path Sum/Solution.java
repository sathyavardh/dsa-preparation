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
    private int maxSumPath = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traversal(root);
        return maxSumPath;
    }
    private int traversal(TreeNode curr){
        if(curr==null) return 0;
        int maxLeft = Math.max(0,traversal(curr.left));
        int maxRight = Math.max(0,traversal(curr.right));
        int currMax = curr.val+maxLeft+maxRight;
        maxSumPath = Math.max(currMax, maxSumPath);
        return curr.val+Math.max(maxLeft, maxRight);
    }
}