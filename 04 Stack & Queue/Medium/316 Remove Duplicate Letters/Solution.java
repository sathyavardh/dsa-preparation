class Solution {
    public String removeDuplicateLetters(String s) {
    
        int[] count = new int[26]; // count of each character
        boolean[] visited = new boolean[26]; // tracks if a char is already in stack

        // Count frequencies of each character
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            count[ch - 'a']--; // we are using this character once

            // if already in stack, skip
            if (visited[ch - 'a']) {
                continue;
            }

            //maintain lexicographical order
            while(!stack.isEmpty() && stack.peek() > ch && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop()-'a'] = false;
            }

            // Add current character to stack
            stack.push(ch);
            visited[ch-'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        for(char ch: stack){
            result.append(ch);
        }

        return result.toString();

    }
}