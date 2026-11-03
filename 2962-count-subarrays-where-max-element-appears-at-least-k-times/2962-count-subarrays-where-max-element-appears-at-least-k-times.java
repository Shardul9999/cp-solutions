class Solution {
    public long fun(int[] nums, int k, int max){
        int low = 0;
        int high = 0;
        int count = 0;
        long ans = 0;
        while(high < nums.length){
            if(nums[high] == max){
                count++;
            }
            while(count >= k){
                if(nums[low] == max){
                    count--;
                }
                low++;
            }
            ans += low;
            high++;
        }
        return ans;
    }
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            max = Math.max(max, x);
        }
        long ans = fun(nums,k,max);
        return ans;
    }
}