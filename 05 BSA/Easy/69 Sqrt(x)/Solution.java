class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;

        int l=2, r=x/2;
        while(l<=r){
            int m = (l+r)/2;
            long sq = (long)m*m;
            if(x == sq) return m;
            
            if(x < sq){
                r=m-1;
            }
            else{
                l=m+1;
            }    
        }

        return r;
    }
}