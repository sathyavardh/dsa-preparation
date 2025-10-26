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

//  Approach - 1 Bottom Up
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}

// Approach - 2 Top Down


class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        traversal(root, val);
        return root;
    }
    public void traversal(TreeNode curr, int val){
        if(curr.val<val){
            if(curr.right==null){
                curr.right = new TreeNode(val);
            }else{
                traversal(curr.right, val);
            }
        }else{
            if(curr.left==null){
                curr.left = new TreeNode(val);
            }else{
                traversal(curr.left, val);
            }        
        }
    }
}