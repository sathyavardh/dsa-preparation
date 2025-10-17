/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // Nested helper class is visible to all methods
    static class Result{
            TreeNode lca = null;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        Result result = new Result();
        bottomUpTraversal(root, p, q, result);
        return result.lca;
    }
    private static int bottomUpTraversal(TreeNode curr, TreeNode p, TreeNode q, Result result) {
        if(curr==null) return 0;
        int count = 0;
        int ansOnLeft = bottomUpTraversal(curr.left, p, q, result);
        int ansOnRight = bottomUpTraversal(curr.right, p, q, result);
        
        if(curr.val==p.val || curr.val==q.val){
            count++;
        }
        count = count + ansOnLeft + ansOnRight;

        if(count==2 && result.lca==null){
            result.lca = curr;
        }
        return count;
    }
}