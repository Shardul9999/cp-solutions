class Solution {
    public static boolean isPresent(String s, String rows){
        for(char c : s.toCharArray()){
            if(rows.indexOf(Character.toLowerCase(c)) == -1){
                return false;
            }
        }
        return true;
    }
    
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String one = "qwertyuiop";
        String two = "asdfghjkl";
        String three = "zxcvbnm";

        for(String s : words){
            if(isPresent(s,one) || isPresent(s,two) || isPresent(s,three)){
                ans.add(s);
            }
        }

        return ans.toArray(new String[0]);
    }
}