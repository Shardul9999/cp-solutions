class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length - 1; i += 2){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[i]).append(nums[i+1]);
            int val = Integer.parseInt(sb.toString());
            min = Math.min(val,min);
        }
        return min;
    }
}