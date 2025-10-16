// Approach - 1 Recursion

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;

        if(isSameTree(root, subRoot)) return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isSameTree(TreeNode p, TreeNode q){
        if(p== null && q==null) return true;
        if(p==null || q ==null) return false;

        return p.val == q.val && isSameTree(p.left, q.left)
                                       && isSameTree(p.right, q.right);
    }
}

// Approach - 2 Serialization (Optimized)

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String hashRoot = serialize(root, "");
        String hashSubRoot = serialize(subRoot, "");
        return hashRoot.contains(hashSubRoot);
    }
    private static String serialize(TreeNode root, String hash){
        if(root==null){
            return hash+"-#";
        }
        hash += "-"+root.val;
        hash = serialize(root.left, hash);
        hash = serialize(root.right, hash);
        return hash;
    }
}