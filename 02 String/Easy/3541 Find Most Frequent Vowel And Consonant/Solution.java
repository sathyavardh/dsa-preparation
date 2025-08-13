class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        //Store all value in the freq in map
        for(char ch:s.toCharArray()){
            hash.put(ch, hash.getOrDefault(ch,0)+1);
        }

        int maxVowel =0;
        int maxConsonant =0;

        //Find the maxVowel and maxConsonant inside the map
        for(var entry:hash.entrySet()){
            char ch = entry.getKey();
            int freq = entry.getValue();
            if(vowels.contains(ch)){
                maxVowel= Math.max(maxVowel, freq);
            }else{
                maxConsonant = Math.max(maxConsonant, freq);
            }
        }
        return maxVowel+maxConsonant; 
    }
}