class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
       
        Deque<Integer> dq = new ArrayDeque<>();
        long[] prefix = new long[n+1];

        prefix[0] = 0;

        for(int i=0; i<n; i++){
            prefix[i+1] = prefix[i]+nums[i];
        }

        int ans = n+1;

        for(int i=0; i<=n; i++){
            while(!dq.isEmpty() && prefix[i]-prefix[dq.peekFirst()]>=k){
                ans = Math.min(ans, i-dq.pollFirst());
            }
            while(!dq.isEmpty() && prefix[i]<=prefix[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        return ans<=n?ans:-1;
    }
}