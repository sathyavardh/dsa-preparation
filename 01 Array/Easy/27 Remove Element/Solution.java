class Solution {
    public int removeElement(int[] nums, int val) {
        int x=0;
        int temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                temp= nums[x];
                nums[x]=nums[i];
                x+=1;
            }
        }
        return x;
        
    }
}