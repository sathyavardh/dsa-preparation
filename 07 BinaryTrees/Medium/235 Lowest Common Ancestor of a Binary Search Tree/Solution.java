/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//  Bottom Up Approach

class Solution {
   
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return traversal(root, p, q);
    }
    public TreeNode traversal(TreeNode curr, TreeNode p, TreeNode q){
        if(curr==null) return null;
        if(p.val<curr.val && q.val<curr.val){
            return traversal(curr.left, p, q);
        }else if(p.val>curr.val && q.val>curr.val){
            return traversal(curr.right, p, q);
        }
        return curr;  
    }
}