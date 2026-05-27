class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        Map<Character, Integer> lower = new HashMap<>();
        Map<Character, Integer> upper = new HashMap<>();

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);

            if(Character.isLowerCase(ch)){
                lower.put(ch,i);
            }
            else{
                upper.putIfAbsent(Character.toLowerCase(ch),i);
            }
        }

        for(char ch = 'a'; ch <= 'z'; ch++){
            if(lower.containsKey(ch) && upper.containsKey(ch) && lower.get(ch) < upper.get(ch)){
                count++;
            }
        }

        return count;
    }
} 