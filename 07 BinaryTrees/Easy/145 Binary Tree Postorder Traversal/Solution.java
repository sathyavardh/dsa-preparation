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
    public void traversal(TreeNode curr, List<Integer> ans){
        if(curr==null) return;
        traversal(curr.left, ans);
        traversal(curr.right, ans);
        ans.add(curr.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        traversal(root, ans);
        return ans;
    }
}

// Approach - 2 Iterative 2 stacks


class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        s1.push(root);

        if(root==null) return ans;

        while(!s1.isEmpty()){
            TreeNode curr = s1.pop();
            s2.push(curr);
            if(curr.left!=null) s1.push(curr.left);
            if(curr.right!=null) s1.push(curr.right);   
        }

        while(!s2.isEmpty()){
            ans.add(s2.pop().val);
        }

        return ans;
    }
}

// Approach - 3 Iterative 1 stack

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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode lastVisited = null;
        TreeNode curr = root;

        while(!stack.isEmpty() || curr!=null){
            //push all values from stack till i reach left most bottom
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            //peeking top element
            TreeNode peekNode = stack.peek();
            //if right exists and its not equal to the lastVisited
            if(peekNode.right!=null && peekNode.right!=lastVisited){
                curr = peekNode.right;
            }else{
                ans.add(peekNode.val);
                lastVisited = stack.pop();
            }
        }
        return ans;
    }
}