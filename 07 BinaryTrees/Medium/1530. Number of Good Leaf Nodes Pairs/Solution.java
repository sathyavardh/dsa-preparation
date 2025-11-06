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
    int count = 0;
    int limit;
    public int countPairs(TreeNode root, int distance) {
        limit = distance;
        dfs(root); 
        return count;
    }
    public List<Integer> dfs(TreeNode curr){
        if(curr==null) return new ArrayList<>();
      
        if(curr.left==null && curr.right==null){
            List<Integer> leaves = new ArrayList<>();
            leaves.add(1);
            return leaves; 
        }   

        List<Integer> left = dfs(curr.left);
        List<Integer> right = dfs(curr.right);
        
        for(int l:left){
            for(int r:right){
                if(l+r<=limit) count++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int l:left){
            if(l+1<=limit) result.add(l+1);
        }
        for(int r:right){
            if(r+1<=limit) result.add(r+1);
        }
   
        return result;
    }
}