class Solution {
    public void helper(int n, int open, int close, StringBuilder temp , List<String> lis){
        if(open == n && close == n){
            lis.add(temp.toString());
            return;
        }

        if(open < n){
            temp.append("(");
            helper(n, open+1, close, temp, lis);
            temp.deleteCharAt(temp.length() - 1);
        }

        if(close < open){
            temp.append(")");
            helper(n, open, close+1, temp, lis);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> lis = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        helper(n,0,0,temp,lis);
        return lis;
    }
}