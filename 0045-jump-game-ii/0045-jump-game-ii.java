class Solution {
    public int jump(int[] nums) {
        if(nums.length < 2) return 0;

        int maxIndx = 0;
        int currentEnd = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            maxIndx = Math.max(i + nums[i], maxIndx);
            if(currentEnd == i){
                count++;
                currentEnd = maxIndx;
            }

            if(currentEnd >= nums.length-1) return count;
        }
        return 0;
    }
}