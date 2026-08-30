class Solution {
    public int minimumDeletions(int[] nums) {
        int max = 0;
        int min = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] < nums[min]) min = i;
            if(nums[i] > nums[max]) max = i;
        }

        int left = Math.min(min,max);
        int right = Math.max(min,max);

        int front = right + 1;
        int back = nums.length - left;
        int both = (left + 1) + (nums.length - right); 

        return Math.min(both, Math.min(back,front));
    }
}