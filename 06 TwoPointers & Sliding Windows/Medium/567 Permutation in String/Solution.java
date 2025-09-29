class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;

        int[] hashS = new int[26];
        int[] hashW = new int[26];

        Arrays.fill(hashS,0);
        Arrays.fill(hashW,0);
        int winLen = s1.length();

        for(int i=0; i<winLen; i++){
            ++hashS[s1.charAt(i)-'a'];
            ++hashW[s2.charAt(i)-'a'];
        }    

        int i=0;
        int j=winLen-1;
        while(j<s2.length()){
            if(isHashSame(hashS, hashW)){
                return true;
            }
            --hashW[s2.charAt(i)-'a'];
            i++;
            j++;
            if(j<s2.length()){
                ++hashW[s2.charAt(j)-'a'];   
            }
        }
        return false;
    }

    public static boolean isHashSame(int[] hashS, int[] hashW){
        for(int i=0; i<26; i++){
            if(hashS[i]!=hashW[i]){
                return false;
            }
        }
        return true;
    }
}