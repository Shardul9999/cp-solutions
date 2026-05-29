class Solution {
    public int minElement(int[] nums) {
        int min_ele = Integer.MAX_VALUE;

        for(int ele : nums){
            int temp = ele;
            int ans = 0;
            while(temp > 0){
                ans += temp % 10;
                temp /= 10;
            }
            min_ele = Math.min(min_ele,ans);
        }
        return min_ele;
    }
}