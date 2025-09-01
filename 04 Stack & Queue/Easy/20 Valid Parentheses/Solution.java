class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>(Map.of(
            '{','}',
            '(',')',
            '[',']'
        ));

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(ch!=map.get(top)){
                    return false;
                }
            }  
        }
        return stack.isEmpty();
    }
}