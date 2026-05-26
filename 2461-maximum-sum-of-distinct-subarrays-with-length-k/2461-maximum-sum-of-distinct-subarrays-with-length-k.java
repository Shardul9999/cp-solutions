class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max_sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        int left = 0;
        int right = k-1;

        for(int i=left; i<=right; i++){
            sum += nums[i];
            mp.put(nums[i], mp.getOrDefault(nums[i],0) + 1);
        }

        while(right < nums.length){
            if(mp.size() == k) {
                max_sum = Math.max(max_sum, sum);
            }
            right++;

            if(right == nums.length) break;

            sum += nums[right];
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            sum -= nums[left];
            mp.put(nums[left], mp.get(nums[left]) - 1);

            if(mp.get(nums[left]) == 0) mp.remove(nums[left]);
            left++;
        }

        return max_sum;
    }
}