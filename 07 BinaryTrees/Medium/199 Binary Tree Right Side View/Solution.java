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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                TreeNode curr = q.poll();
                if(i==levelSize-1){
                    ans.add(curr.val);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }  
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }   
        }
        return ans;
    }
}