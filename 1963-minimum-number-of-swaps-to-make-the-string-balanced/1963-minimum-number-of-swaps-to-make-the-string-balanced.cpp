class Solution {
public:
    int minSwaps(string s) {
        int low = 0;
        int high = s.size()-1;
        int open_cnt = 0;
        int close_cnt = 0;
        int swaps = 0;

        while(low < high){
            if(s[low] == '[') open_cnt++;
            else close_cnt++;

            if(close_cnt > open_cnt){
                swaps++;
                while(low < high && s[high] != '['){
                    high--;
                }
                
                swap(s[low], s[high]);
                close_cnt--; 
                open_cnt++;
                high--;
            }
            low++;
        }
        return swaps;
    }
};