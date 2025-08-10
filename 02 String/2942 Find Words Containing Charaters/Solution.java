class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        int n= words.length-1;
        int i=0;
        List<Integer> result = new ArrayList<>();

        while(i<=n){
            int j=0;
            while(j<=words[i].length()-1){
                if(words[i].charAt(j)==x){
                    result.add(i);
                    break;
                }
                j++;      
            }
            i++;
        }
        return result;
    }
}