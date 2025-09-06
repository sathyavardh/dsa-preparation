class Solution {
    public int[] dailyTemperatures(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        stack.push(n-1);
        ans[n-1] = 0;

        for(int i=n-2; i>=0; i--){
            while(!stack.isEmpty()){
                int top = stack.peek();
                if(arr[i]>=arr[top]){
                    stack.pop();
                }else{
                    ans[i] = top-i;
                    break;
                }
            }

            if(stack.isEmpty()){
                ans[i] = 0;
            }
            stack.push(i);
        }

        return ans;
        
    }
}