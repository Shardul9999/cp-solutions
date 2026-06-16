class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();

        for(Character ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(ch);
            }
            else if(ch.equals('*') && sb.length() >= 1){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(ch.equals('#')){
                sb.append(sb);
            }
            else if(ch.equals('%')){
                sb.reverse();
            }
        }

        return sb.toString();
    }
}