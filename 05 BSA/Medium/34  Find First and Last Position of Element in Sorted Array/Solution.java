// Approach - 1 Brute Force

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n= nums.length;
        List<Integer> index = new ArrayList<>();     

        for(int i=0; i<n; i++){
            if(nums[i]==target){
                index.add(i);
            }
        }
        if(index.isEmpty()){
            return new int[] {-1,-1};
        }else{
            return new int[] {index.get(0), index.get(index.size()-1)};
        }
    }
}

//Approach - 2 Binary Search

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r=n-1;

        int[] result = {-1,-1};

        //Corner Case
        if(n==0) return result;

        //FirstIndex
        while(l<r){
            int m= l+(r-l)/2; 
            if(nums[m]<target) l=m+1;
            else r=m;
        }

        if(nums[l]==target) result[0]=l;

        //Reset the l and r
        l=0;
        r=n-1;

        //Right Index
        while(l<r){
            int m= l+(r-l+1)/2; // bias right step up
            if(nums[m]>target) r=m-1;
            else l=m;
        }

        if(nums[r]==target) result[1]=r;

        return result;
    }
}

// Approach - 3 (Binary Search with some greedy)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;

        int l=0;
        int r=n-1;

        int[] ans = {-1,-1};

        //cornerCase
        if(n==0) return ans;

        //firstIndex
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else if(nums[m]>target){
                r=m-1;
            }else if(nums[m]==target){
                ans[0]=m;
                r=m-1;
            }
        }

        l=0;
        r=n-1;

        //lastIndex
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]<target){
                l=m+1;
            }else if(nums[m]>target){
                r=m-1;
            }else if(nums[m]==target){
                ans[1]=m;
                l=m+1;
            }
        }

        return ans;
        
    }
}