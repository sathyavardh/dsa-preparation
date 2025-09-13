
// Approach - 1 Brute Force
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        int currMax =0;
        int maxEle = 0;

        for(int i=0; i<n-1; i++){
            if(nums[i]<nums[i+1]){
                currMax=i+1;
            }
        
            if(nums[currMax]>nums[maxEle]){
                maxEle = currMax;
            }
        }

        return maxEle;
        
    }
}

//Approach - 2 Binary Search
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;

        int l=0;
        int r=n-1;

        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]<nums[m+1]){
                l=m+1;
            }else{
                r=m;
            }
        }
        return r;
        
    }
}