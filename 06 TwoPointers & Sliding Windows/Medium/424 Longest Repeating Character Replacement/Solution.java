// Approach - 1 using hashmap

class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, j=0;
        int n= s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxWindow = 0;
        map.put(s.charAt(0),1);

        while(j<n){    
            if(isWindowValid(map, k)){
                maxWindow = Math.max(maxWindow, j-i+1);
                j++;
                if(j<s.length()){
                    char ch = s.charAt(j);
                    map.put(ch, map.getOrDefault(ch,0)+1);
                }     
            }else{
                char ch = s.charAt(i);
                map.put(ch, map.get(ch)-1);
                ++i;
            }
        }
        return maxWindow;
    }

    public static boolean isWindowValid(HashMap<Character, Integer> map, int k){
        int totalCnt = 0;
        int maxCnt = 0;
        for(int i=0; i<26; i++){
            char ch = (char) (i+'A');
            if(map.containsKey(ch)){
                totalCnt=totalCnt+map.get(ch);
                maxCnt = Math.max(maxCnt, map.get(ch));
            }
        }
        return totalCnt-maxCnt<=k;
    }
}


// Approach - 2 using arr

class Solution {
    public int characterReplacement(String s, int k) {
        int i=0, j=0;
        int n= s.length();
        int[] map = new int[26];
        Arrays.fill(map, 0);
        int maxWindow = 0;
        map[s.charAt(0)-'A']=1;

        while(j<n){    
            if(isWindowValid(map, k)){
                maxWindow = Math.max(maxWindow, j-i+1);
                j++;
                if(j<s.length()){
                    char ch = s.charAt(j);
                    ++map[ch-'A'];
                }     
            }else{
                char ch = s.charAt(i);
                --map[ch-'A'];
                ++i;
            }
        }
        return maxWindow;
    }

    public static boolean isWindowValid(int[] map, int k){
        int totalCnt = 0;
        int maxCnt = 0;
        for(int i=0; i<26; i++){
            totalCnt=totalCnt+map[i];
            maxCnt = Math.max(maxCnt, map[i]);      
        }
        return totalCnt-maxCnt<=k;
    }
}