class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        }
        
        int[] temp = nums.clone();
        Arrays.sort(temp);

        if(k == 1){
            for(int i=temp.length-1; i >= 0; i--){
                if(mp.get(temp[i]) == 1) return temp[i];
            }
        }

        if(k == nums.length){
            return temp[temp.length - 1];
        }

        int ans = -1;
        if (mp.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (mp.get(nums[nums.length - 1]) == 1) {
            ans = Math.max(ans, nums[nums.length - 1]);
        }
        
        
        return ans;
    }
}