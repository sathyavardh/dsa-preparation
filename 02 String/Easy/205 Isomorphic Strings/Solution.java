class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> mapStoT = new HashMap<>(); //forwardCheck
      HashMap<Character, Character> mapTtoS = new HashMap<>(); //reverseCheck

      for(int i=0; i<s.length(); i++){
        Character cs = s.charAt(i);
        Character ct = t.charAt(i);
        // if both mappings are not present, insert them with forward and reverse
        if(!mapStoT.containsKey(cs) && !mapTtoS.containsKey(ct)){
            mapStoT.put(cs,ct);
            mapTtoS.put(ct,cs);
        }else{
            if (!ct.equals(mapStoT.get(cs)) || !cs.equals(mapTtoS.get(ct))) {
                    return false;
            }
        }
      }
      return true;
    }
}