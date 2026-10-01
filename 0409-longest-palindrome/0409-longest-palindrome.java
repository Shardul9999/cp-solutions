class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean has_odd = false;

        for(int count : mp.values()){
            if(count % 2 == 0){
                length += count;
            }
            else{
                length += count - 1;
                has_odd = true;
            }
        }
        if(has_odd){
            length += 1;
        }

        return length;
    }
}