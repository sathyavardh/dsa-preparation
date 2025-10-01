// Approach - 1 (Brute Force) - TLE

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<=n-k; i++){
            int maxNo = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                maxNo = Math.max(maxNo, nums[j]);
            }
            list.add(maxNo);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Approach - 2 Monotonic Decreasing Dequeue

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int i = 0, j=0;

        Deque<Integer> dq = new ArrayDeque<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();

        while(j<n){
            while(!dq.isEmpty() && dq.peekLast()<nums[j]) dq.pollLast();
            dq.offerLast(nums[j]);
            if(j>=k-1){
                res.add(dq.peekFirst());
                if(dq.peekFirst()==nums[i]){
                    dq.pollFirst();
                }
                i++;
            }
            j++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}