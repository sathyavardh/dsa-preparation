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


//  Approach - 1 Top Down
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return traversal(root, 0, targetSum);
    }
    public static boolean traversal(TreeNode curr, int currSum, int targetSum){
        if(curr==null) return false;
        currSum+=curr.val;
        if(curr.left==null && curr.right==null){
            return currSum == targetSum;
        }
        return traversal(curr.left, currSum, targetSum) || 
                traversal(curr.right, currSum, targetSum);
    }
}

//  Approach - 1 DownUp

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;

        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }

        boolean leftSubTreeHasPathSum = hasPathSum(root.right, targetSum-root.val);
        boolean rightSubTreeHasPathSum = hasPathSum(root.left, targetSum-root.val);

        return leftSubTreeHasPathSum || rightSubTreeHasPathSum;
    }
}