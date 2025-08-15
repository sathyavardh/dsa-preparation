class Solution {
    public boolean isPalindrome(String s) {       
        s = s.toLowerCase();
        int strLn = s.length();
        int left =0;
        int right = strLn-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                ++left;
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                --right;
            }else if(s.charAt(left)==s.charAt(right)){
                ++left;
                --right;
            }else {
                return false;
            }
        }
        return true;
    }
}