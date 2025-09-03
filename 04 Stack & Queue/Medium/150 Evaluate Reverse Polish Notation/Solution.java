
// Approach - 1 using if-else
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String token = tokens[i];
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(token);
            }else{
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int c = 0;

                if(token.equals("+")){
                    c = b+a;   
                }else if(token.equals("-")){    
                    c = b-a;
                }else if(token.equals("*")){
                    c = b*a;             
                }else if(token.equals("/")){
                    c = b/a;              
                }
                stack.push(String.valueOf(c));
            }            
        }
        return Integer.parseInt(stack.pop());
    }
}


// Approach - 2 using Map, functional Interface, Lampda Expression

class Solution {

    interface Operator{
        int apply(int a, int b);
    }
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        Map<String, Operator> map = new HashMap<>();

        map.put("+",(a,b)->b+a);
        map.put("-",(a,b)->b-a);
        map.put("*",(a,b)->b*a);
        map.put("/",(a,b)->b/a);

        for(String token:tokens){
            if(map.containsKey(token)){
                int a = stack.pop();
                int b = stack.pop();
                int ans = map.get(token).apply(a,b);
                stack.push(ans);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
        
    }
}