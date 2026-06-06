class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum  = new int[nums.length];
        int [] rightSum = new int[nums.length];
        int [] ans = new int[nums.length];

        int leftsum = 0;
        int rightsum = 0; 
        
        for(int i=0; i<nums.length; i++){
            leftSum[i] = leftsum;
            leftsum += nums[i];
        }

        for(int i=nums.length-1; i>=0; i--){
            rightSum[i] = rightsum;
            rightsum += nums[i];
        }

        for(int i=0; i<nums.length; i++){
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}