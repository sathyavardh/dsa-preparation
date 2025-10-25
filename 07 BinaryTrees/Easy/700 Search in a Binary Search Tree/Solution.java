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

//  Approach Top Down
class Solution {
    TreeNode ans = null;
    public TreeNode searchBST(TreeNode root, int val) {
        traversal(root, val);
        return ans;
    }
    public void traversal(TreeNode curr, int val){
        if(curr == null) return;
        if(curr.val==val){
            ans = curr;
            return;
        }else{
            if(curr.val<val){
                if(curr.right!=null) traversal(curr.right, val);
            }else{
                if(curr.left!=null) traversal(curr.left, val);
            }
        }
    }
}

// Approach Bottom Up
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val) return root;
        return root.val<val?
                searchBST(root.right, val):
                searchBST(root.left, val);
    }
}