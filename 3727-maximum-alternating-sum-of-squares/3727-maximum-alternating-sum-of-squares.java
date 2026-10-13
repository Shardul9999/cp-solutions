class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int n = nums.length;

        long ans = 0;
        Arrays.sort(nums);
        int k = n/2;

        for(int i=0; i<k; i++){
            ans -= nums[i];
        }
        for(int i=k; i<n; i++){
            ans += nums[i];
        }
        return ans;
    }
}