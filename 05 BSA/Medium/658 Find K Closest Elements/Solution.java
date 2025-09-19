// Approach - 1 Binary Search

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int bestStart = 0;

        for(int i=0; i<n-k; i++){
            int leftDiff  = Math.abs(arr[i]-x);
            int rightDiff = Math.abs(arr[i+k]-x);
            if(leftDiff>rightDiff){
                bestStart=i+1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for(int i=bestStart; i<bestStart+k; i++){
            result.add(arr[i]);
        }
        return result;
    }
}


//Approach - 2 Binary Search

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int l = 0;
        int r = n-k;

        while(l<r){
            int m= l+(r-l)/2;
            if((arr[m+k]-x) < (x-arr[m])){
                l=m+1;
            }else{
                r=m;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i=r; i<r+k; i++){
            result.add(arr[i]);
        }

        return result;
    }
}