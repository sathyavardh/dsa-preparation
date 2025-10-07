class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                return true;
            }
            // If duplicates at the ends and mid, we can't decide - shrink both ends
            if(nums[l]==nums[mid] && nums[mid]==nums[r]){
                l++;
                r--;
            }else if(nums[l]<=nums[mid]){  //Left-Portion
                if(nums[l]<=target && nums[mid]> target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{ //Right-Portion
                if(nums[mid]<target && nums[r]>=target){
                    l=mid+1;
                }else{
                    r=mid-1;
                }
            }       
        }
        return false;
    }
}