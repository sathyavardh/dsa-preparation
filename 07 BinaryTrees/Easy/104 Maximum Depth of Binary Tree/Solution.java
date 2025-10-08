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
    public int maxDepth(TreeNode root) {
        // Primitives (like int) are passed by value → a copy is passed, so changes inside  the method do NOT affect the original variable.
        // Objects and arrays are passed by reference → the method gets a reference to the original object, so changes to its contents arr reflected outside.

        int[] maxDepth = new int[1];

        if(root==null) return 0;
        traverse(root, 1, maxDepth);
        return maxDepth[0];
    }
    public static void traverse(TreeNode curr, int depth, int[] maxDepth){
        maxDepth[0] = Math.max(maxDepth[0], depth);
        if(curr.left!=null)  traverse(curr.left, depth+1, maxDepth);
        if(curr.right!=null) traverse(curr.right, depth+1, maxDepth);
    }
}

// Approach -2 Bottom Up

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        return 1+Math.max(leftMax, rightMax);
    }
}