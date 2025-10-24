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
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    public static boolean isBST(TreeNode curr, TreeNode lo, TreeNode hi) {
        if (curr == null)
            return true;

        // Check BST condition
        if ((lo != null && curr.val <= lo.val) || (hi != null && curr.val >= hi.val)) {
            return false;
        }

        // Recursively check left and right subtrees
        boolean isLeftBST = isBST(curr.left, lo, curr);
        boolean isRightBST = isBST(curr.right, curr, hi);

        return isLeftBST && isRightBST;
    }
}