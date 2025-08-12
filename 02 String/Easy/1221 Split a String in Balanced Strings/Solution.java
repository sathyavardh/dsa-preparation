class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length()-1;
        int temp=0;
        int count=0;

        for(int i=0; i<=n; i++){
            if(s.charAt(i)=='R'){
                temp=temp+1;
            }else if(s.charAt(i)=='L'){
                temp=temp-1;
            }

            if(temp==0){
                count+=1;
            }

        }
        return count;
        
    }
}