class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        for(int x : nums){
            total = total ^ x;
        }

        if(total != 0) return nums.length;
        
        for(int x : nums){
            if(x != 0) return nums.length - 1;
        }

        return 0;
    }
}