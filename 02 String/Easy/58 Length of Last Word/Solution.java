class Solution {
    public int lengthOfLastWord(String s) {
        //Trim all spaces at the end
        int n = s.length()-1; //Start from last char
        while(n>=0){
            if(s.charAt(n)!=' ') break;
            --n;
        }

        //n is the point where last word starts
        //count the character till reach you a space

        int count = 0;
        while(n>=0){
            if(s.charAt(n)==' ') break;
            --n;
            ++count;
        }

        return count;

    }
}