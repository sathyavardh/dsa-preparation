class Solution {
    public void reverseString(char[] s) {
        int totalLen = s.length;
        int halfLen = s.length/2;
        char temp;


        for(int i=0; i<halfLen; i++){
            temp= s[i];
            s[i]=s[totalLen-1-i];
            s[totalLen-1-i]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}