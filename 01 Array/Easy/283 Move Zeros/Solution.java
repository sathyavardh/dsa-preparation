class Solution {
    public void moveZeroes(int[] nums) {
        int x=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[x]=nums[i];
                x+=1;
            }
        }
        //fill all the remaining elements from x to nums.length-1
        for(int i=x; i<nums.length; i++){
            nums[i]=0;
        }
        
    }
}