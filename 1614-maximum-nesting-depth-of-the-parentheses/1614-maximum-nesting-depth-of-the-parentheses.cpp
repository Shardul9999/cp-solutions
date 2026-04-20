class Solution {
public:
    int maxDepth(string s) {
        int count = 0;
        int max_paren = 0;
        for(int i=0; i<s.length(); i++){
            if(s[i] == '('){
                count++;
                max_paren = max(count,max_paren);
            }
            else if(s[i] == ')'){
                count -= 1;
            }
        }
        return max_paren;
    }
};