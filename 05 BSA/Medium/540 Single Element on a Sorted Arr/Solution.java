class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l=0;
        int r=n-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(m>0 && nums[m]==nums[m-1]){  //pair exists on left side
                int leftCount = m-1-l;
                if(leftCount%2==1){
                    r=m-2;        
                }else{
                    l=m+1;  
                }   
            }else if(m<n-1 && nums[m]==nums[m+1]){  //pair exists on right side
                int leftCount = m-l;
                if(leftCount%2==1){
                    r=m-1;   
                }else{
                    l=m+2;
                }
            }else{
                return nums[m];
            }
        }

        return nums[r];
    }
}