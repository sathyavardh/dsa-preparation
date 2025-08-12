class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jwlLength = jewels.length()-1;
        int stnLength = stones.length()-1;
        int count =0;

        for(int i=0; i<=stnLength; i++){
            for(int j=0; j<=jwlLength; j++){
                if(stones.charAt(i)==jewels.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
        
    }
}