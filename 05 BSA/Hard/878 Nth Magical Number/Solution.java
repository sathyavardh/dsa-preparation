class Solution {
    public int nthMagicalNumber(int n, int a, int b) {

        long MOD = 1_000_000_007; // (10^9 + 7)
        long left = 1, right = (long) Math.min(a,b)*n;

        // To Ignore Duplicate
        long lcm_ab = lcm(a,b);

        while(left<right){
            long mid = left+(right-left)/2;

            long count = mid/a+mid/b-mid/lcm_ab;

            if(count<n){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        return (int) (right%MOD);
    }

    private long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    private long lcm(long a, long b){
        // Avoids overflow by dividing before multiplying (a*b)/gcd(a,b)
        return a/gcd(a,b)*b;
    }
}