// Approach - 1 Iterative 
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.offer(root);
        int level = 0;


        while(!q.isEmpty()){
            List<Integer> levelArr = new ArrayList<>();
            int levelSize = q.size();

            for(int i=0; i<levelSize; i++){
                TreeNode curr = q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                if(level%2==0){
                    levelArr.addLast(curr.val);
                }else{
                    levelArr.addFirst(curr.val);
                }
            }
            ans.add(levelArr);
            level++;
        }
        return ans;
    }
}

// Approach - 2 Recursion


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        traversal(root, 0, ans);
        return ans;
    }
    public static void traversal(TreeNode curr, int level, List<List<Integer>> ans){
        if(ans.size()==level){
            ans.add(new ArrayList<>());
        }
        if(level%2==0){
            ans.get(level).addLast(curr.val);
        }else{
            ans.get(level).addFirst(curr.val);
        }
        if(curr.left!=null) traversal(curr.left, level+1, ans);
        if(curr.right!=null) traversal(curr.right, level+1, ans);
    }
}