class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;

        while(l<r){
            int m=l+(r-l)/2;

            if(arr[m+1]>arr[m]){
                l=m+1;
            }else if(arr[m+1]<arr[m]){
                r=m;
            }
        }

        return l;
    }
}