class Solution {
     public int maxSubArray(int[] arr) {
        int bestending = arr[0];
        int ans = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int v1 = bestending + arr[i];
            int v2 = arr[i];
            
            bestending = Math.max(v1,v2);
            ans = Math.max(ans, bestending );
        }
        return ans;
    }

    public int minSubArray(int[] arr) {
        int bestending = arr[0];
        int ans = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int v1 = bestending + arr[i];
            int v2 = arr[i];
            
            bestending = Math.min(v1,v2);
            ans = Math.min(ans, bestending );
        }
        return ans;
    }
    public int maxAbsoluteSum(int[] nums) {
        int ans1 = maxSubArray(nums);
        int ans2 = minSubArray(nums);

        return Math.max(ans1, Math.abs(ans2));
    }
}