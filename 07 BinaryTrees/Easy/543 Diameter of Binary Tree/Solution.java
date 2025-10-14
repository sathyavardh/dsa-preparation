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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxDiameter = new int[1];
        findDepth(root, maxDiameter);
        return maxDiameter[0];
    }
    public static int findDepth(TreeNode root, int[] maxDiameter){
        if(root==null) return 0;
        int leftSubTree = findDepth(root.left, maxDiameter);
        int rightSubTree = findDepth(root.right, maxDiameter);
        int currDiameter = leftSubTree+rightSubTree;
        maxDiameter[0] = Math.max(maxDiameter[0], currDiameter);
        return 1+Math.max(leftSubTree, rightSubTree);
    }
}