class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length<=1) return nums;
        int mid = nums.length/2;

        int[] left = sortArray(Arrays.copyOfRange(nums, 0,mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    private int[] merge(int[]left, int[]right){
        int[] res = new int[left.length+right.length];
        int i=0, j=0, k=0;

        while(i<left.length && j<right.length){
            res[k++]= (left[i]<right[j])?left[i++]:right[j++];
        }

        while(i<left.length) res[k++]= left[i++];
        while(j<right.length) res[k++]= right[j++];

        return res;
    }
}