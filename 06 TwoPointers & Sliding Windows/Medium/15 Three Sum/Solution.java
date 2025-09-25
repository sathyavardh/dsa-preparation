class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i==0 || nums[i]!=nums[i-1]){
                twoSum(nums, i, ans);
            }  
        }
        return ans;
    }

    public static void twoSum(int[]nums, int x, List<List<Integer>> ans){
        int i= x+1;
        int j= nums.length-1;

        while(i<j){
            int sum = nums[i]+nums[j]+nums[x];
            if(sum>0){
                --j;
            }
            else if(sum<0){
                ++i;
            }
            else{
                ans.add(new ArrayList<>(Arrays.asList(nums[x],nums[i],nums[j])));
                ++i; --j;
                //corner case to remove duplicates
                while(i<j && nums[i]==nums[i-1]) ++i;
            }
        }
    }
}