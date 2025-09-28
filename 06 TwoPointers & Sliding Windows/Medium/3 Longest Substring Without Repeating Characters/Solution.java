class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int i=0;
        int maxWS = 0;

        for(int j=0; j<n; j++){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=i){
                i=map.get(s.charAt(j))+1;
            }
            map.put(s.charAt(j),j);
            int currWS = j-i+1;
            maxWS = Math.max(maxWS, currWS);
        }
        return maxWS;
    }
}