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
    public boolean isBalanced(TreeNode root) {
        boolean[] ans = new boolean[]{true};
        calculateHeight(root, ans);
        return ans[0];
    }
    public int calculateHeight(TreeNode root, boolean[] ans){
        if(root==null) return 0;
        int leftSubTree = calculateHeight(root.left, ans);
        int rightSubTree = calculateHeight(root.right, ans);

        if(Math.abs(leftSubTree-rightSubTree)>1){
            ans[0] = ans[0] && false;
        }
        return 1+Math.max(leftSubTree,rightSubTree);
    }
}