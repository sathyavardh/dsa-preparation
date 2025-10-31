class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int mod = (int)1e9+7;
        long ans = 0;

        int[] ple = new int[n];
        int[] nle = new int[n];

        Stack<Integer> stack = new Stack<>();

        // Previous Less Element (strictly less)
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]) stack.pop();
            ple[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }

        // Clear before next pass
        stack.clear();
        
        // Next Less Element (less OR equal)
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]) stack.pop();
            nle[i] = stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }

        // Sum Contributions
        for(int i=0; i<n; i++){
            long left = i-ple[i];
            long right = nle[i]-i;
            ans = (ans + (arr[i] * left%mod * right%mod))%mod;
        }
        return (int)ans;
    }
}