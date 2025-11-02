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
    List<String> result = new ArrayList<>();
    public void traversal(TreeNode curr, String ans){

        // Add current node value to path
        ans+=curr.val;

        // base condition
        if(curr.left==null && curr.right==null){
            result.add(ans);
            return;
        }

        // If not a leaf, continue traversal
        if(curr.left!=null) traversal(curr.left, ans + "->");
        if(curr.right!=null) traversal(curr.right, ans + "->");
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null) return new ArrayList<>();
        traversal(root, "");
        return result;
    }
}