// Binary Search

class Solution {
    public int findMin(int[] arr) {
        int l=0;
        int r=arr.length-1;
        
        while(l<=r){
            //if search space is sorted
            if(arr[l]<=arr[r]){
                return arr[l];
            }

            int m = l+(r-l)/2;
            if(m>0 && arr[m]<arr[m-1]){
                return arr[m];
            }

            //if left half is non sorted
            if(arr[l]>arr[m]){
                r=m-1;
            }else{
                l=m+1;
            }
        }

        return -1;
        
    }
}