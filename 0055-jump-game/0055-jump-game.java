class Solution {
    public boolean canJump(int[] nums) {
        int maxIndx = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxIndx) return false;
            maxIndx = Math.max(i + nums[i], maxIndx);
        }
        return true;
    }
}