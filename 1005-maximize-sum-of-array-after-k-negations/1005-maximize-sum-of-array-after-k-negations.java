class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        int minNum = Integer.MAX_VALUE;
        
        for (int num : nums) {
            sum += num;
            minNum = Math.min(minNum, num);
        }
        if(k % 2 != 0){
            sum -= 2 * minNum;
        }

        return sum;
    }
}