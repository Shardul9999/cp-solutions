class Solution {
    public int passwordStrength(String password) {
        Set<Character> st = new HashSet<>();
        int count = 0;

        for(char ch : password.toCharArray()){
            st.add(ch);
        }

        for(char ch : st){
            if(Character.isLowerCase(ch)) count += 1;
            else if(Character.isUpperCase(ch)) count += 2;
            else if(Character.isDigit(ch)) count += 3;
            else{
                count += 5;
            }
        }

        return count;
    }
}