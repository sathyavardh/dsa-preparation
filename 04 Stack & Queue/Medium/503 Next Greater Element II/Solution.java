//Approach - 1 

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int times = 2;
        int[] doubleArr = new int[n*times];

        for(int i=0; i<times; i++){
            for(int j=0; j<n; j++){
                doubleArr[i*n+j] = nums[j];
            }
        }

        int m = doubleArr.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[m];
        Arrays.fill(ans,-1);

        stack.push(doubleArr[m-1]);

        for(int i=m-2; i>=0; i--){
            while(!stack.isEmpty()){
                int top = stack.peek();
                if(doubleArr[i]<top){
                    ans[i] = top;
                    break;
                }else{
                    stack.pop();
                }
            }
            stack.push(doubleArr[i]);
        }

        return Arrays.copyOfRange(ans,0,n);
    }
}

//Approach - 2 Optimized

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        stack.push(nums[n-1]);
        
        for(int i=(2*n)-2; i>=0; i--){
            while(!stack.isEmpty()){
                int top = stack.peek();
                if(nums[i%n]<top){
                    ans[i%n]=top;
                    break;
                }else{
                    stack.pop();
                }
            }
            stack.push(nums[i%n]);
        }

        return Arrays.copyOfRange(ans,0,n);

    }
}