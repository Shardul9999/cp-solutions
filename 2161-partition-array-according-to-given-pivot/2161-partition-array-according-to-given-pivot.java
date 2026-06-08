class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int [] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        int i = 0;
        int j = nums.length - 1;

        while(i < nums.length){
            if(nums[i] < pivot){
                ans[left] = nums[i];
                left++;
            }

            if(nums[j] > pivot){
                ans[right] = nums[j];
                right--;
            }
            i++;
            j--;
        }

        while(left <= right){
            ans[left] = pivot;
            left++;
        }

        return ans;
    }
}