class Solution {
    public int minDeletions(int[] nums) {
        int temp = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]) temp++;
        }
        return nums.length-temp;
    }
}