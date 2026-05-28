class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int low = 0;
        int len = 0;

        for(int high = 0; high < nums.length; high++){
           if(nums[high] == 1){
            len = Math.max(len, high - low + 1);
           }
           else{
            low = high + 1;
           }
        }
        return len;
    }
}