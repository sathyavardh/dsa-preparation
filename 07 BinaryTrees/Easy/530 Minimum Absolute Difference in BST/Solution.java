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
    Integer preVal = null;
    int minVal = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return minVal;
    }

    public void traversal(TreeNode curr){
        if(curr==null) return;

        traversal(curr.left);
        if(preVal!=null){
            int diff = curr.val-preVal;
            minVal = Math.min(diff, minVal);
        }
        preVal = curr.val;
        traversal(curr.right);
    }
}