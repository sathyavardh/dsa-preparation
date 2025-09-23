// Approach - 1 Brute Force (Sliding Window)

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i=0; i<=n-m; i++){
            int j=0;
            for(;j<m; j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
        
    }
}


// Approach - 2 KMP Algo

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        int[] lps = new int[m];
        lps[0]=0;
        int i=0,j=1;

        //Building LPS Arr
        while(j<m){
            if(needle.charAt(i)==needle.charAt(j)){
                lps[j]=i+1;
                ++i;++j;
            }else{
                if(i==0){
                    lps[j]=0;
                    ++j;
                }else{
                    i=lps[i-1];
                }
            }
        }

        //Check for the String needle in haystack using KMP
        i=j=0;

        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                ++i;++j;
            }else{
                if(j==0){
                    ++i;
                }else{
                    j=lps[j-1];
                }
            }

            if(j==m){
                return i-m;
            }
        }
        return -1; //no match
    }
}
