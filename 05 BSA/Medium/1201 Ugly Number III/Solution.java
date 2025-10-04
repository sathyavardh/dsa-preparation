class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long left = 1, right = 2_000_000_000;

        //To Ignore Duplicates
        long lcm_ab = lcm(a,b);
        long lcm_bc = lcm(b,c);
        long lcm_ca = lcm(c,a);
        long lcm_abc = lcm(lcm_ab,c);

        long count = 0;
        
        while(left<right){
            long mid = left+(right-left)/2;

           /*
                * Inclusion-Exclusion Explanation:
                *
                * If we sum mid/2 + mid/3 + mid/6 → some numbers are double or triple counted:
                *   - 6 appears in all three → counted 3 times
                *   - 12 appears in all three → counted 3 times
                *
                * Subtract pairs using - mid/lcm(a,b) - mid/lcm(a,c) - mid/lcm(b,c):
                *   - This removes double counts, but triple-counted numbers (like 6,12)      get subtracted 3 times
                *
                * To fix triple overlap, we add mid/lcm(a,b,c) back:
                *   - This ensures numbers divisible by all three are counted exactly once
            */


            count = mid/a+mid/b+mid/c
                    -mid/lcm_ab-mid/lcm_bc-mid/lcm_ca
                    +mid/lcm_abc;

            if(count<n){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return (int)right;
    }

    private long lcm(long a, long b){
        return a*b/gcd(a,b);
    }

    // Ecludiean GCD
    private long gcd(long no1, long no2){
        if(no2==0) return no1;
        return gcd(no2, no1%no2);
    }

    // private long gcd(long no1, long no2){
    //     long min = (no1<no2)?no1:no2;
    //     while(min>=2){
    //         if((no1%min==0)&&(no2%min==0)){
    //             return min;
    //         }
    //         --min;
    //     }
    //     return 1;
    // }
}