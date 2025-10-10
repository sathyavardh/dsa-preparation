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

//  Approach - 1 Bottom Up (Recursive)
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(TreeNode left, TreeNode right){
        //if leaf node only return true
        if(left==null && right==null) return true;

        if(left==null || right==null) return false;

        return left.val==right.val 
                && isMirror(left.left, right.right) 
                && isMirror(left.right, right.left);
    }
}

// Approach - 2 Iterative


class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        // Add both left and right child initially
        q.offer(root.left);
        q.offer(root.right);

        while(!q.isEmpty()){
            TreeNode p1 = q.poll();
            TreeNode p2 = q.poll();

            if(p1==null && p2==null) continue;
            if(p1==null || p2==null) return false;
            if(p1.val!=p2.val) return false;
            
            //Mirror pairing
            q.offer(p1.left);
            q.offer(p2.right);
            q.offer(p1.right); 
            q.offer(p2.left);
        }
        return true;
    }
}