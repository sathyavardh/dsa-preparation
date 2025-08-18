class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            int[] freqArr = new int[26];

            //Store the respected values
            for(char ch: str.toCharArray()){
                freqArr[ch-'a']++;
            }

            //Key Creation
            StringBuilder key = new StringBuilder();

            for(int count:freqArr){
                key.append("#").append(count);
            }

            //.toString is convert obj to string
            // map.computeIfAbsent(key, mappingFunction)
            map.computeIfAbsent(key.toString(), k->new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}