class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> st = new HashSet<>();
        
        for(char ch : word.toCharArray()) {
            st.add(ch);
        }
        

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(st.contains(ch) && st.contains((char)(ch -'a' + 'A'))) count++;
        }

        return count;
    }
}