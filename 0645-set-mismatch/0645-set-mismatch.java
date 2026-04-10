class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate = -1;
        int actualSum = 0;

        for(int i=0; i<nums.length; i++){
            actualSum += nums[i];
            if(i>0 && nums[i] == nums[i-1]){
                duplicate = nums[i];
            }
        } 

        int expectedSum = nums.length*(nums.length+1)/2;
        int missing = expectedSum - (actualSum - duplicate);
        return new int[]{duplicate, missing};
    }
}