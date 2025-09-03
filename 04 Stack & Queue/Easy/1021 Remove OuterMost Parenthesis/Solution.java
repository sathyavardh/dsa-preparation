
// Approach - 1 with stack
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                if(stack.size()>1) ans.append(s.charAt(i));
            }else{
                if(stack.size()>1) ans.append(s.charAt(i));
                stack.pop();
            }
        }

        return ans.toString();
        
    }
}

// Approach - 2 without stack

class Solution {
    public String removeOuterParentheses(String s) {
        int level = 0;
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                ++level;
                if(level>1) ans.append(s.charAt(i));
            }else{
                if(level>1) ans.append(s.charAt(i));
                --level;
            }
        }

        return ans.toString();
        
    }
}