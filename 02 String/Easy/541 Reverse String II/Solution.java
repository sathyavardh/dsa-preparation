class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();

        for(int i=0; i<ch.length; i+=2*k){
            // Find the end index for the first k characters in this chunk 
            int left = i; 
            int right = Math.min(i + k - 1, ch.length - 1); // avoid going out of bound

            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }

        }
        return new String(ch);
    }
}