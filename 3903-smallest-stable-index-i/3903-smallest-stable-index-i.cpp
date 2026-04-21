class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
        for(int i=0; i<nums.size(); i++){
            int Max = INT_MIN;
            int Min = INT_MAX;

            for(int j=0; j<=i; j++){
                Max = max(Max,nums[j]);
            }

            for(int j=i; j<nums.size(); j++){
                Min = min(Min,nums[j]);
            }

            int ans = Max - Min;

            if(ans <= k) return i;
        }
        return -1;
    }
};