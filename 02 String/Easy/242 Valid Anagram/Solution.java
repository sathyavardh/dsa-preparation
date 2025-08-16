class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        //Inserting the count of s using map
        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //Checking the t string and match the t with map and decrement the count
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch)==0) return false;
            map.put(ch, map.get(ch)-1);
        }

        return true;
        
    }
}