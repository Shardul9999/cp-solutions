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
        
        int arrsum = arr[0];
        for(int i=1; i<arr.length; i++){
            arrsum += arr[i];
        }
        
        return arrsum - ans;
    }

    public int maxSubarraySumCircular(int[] arr) {
        int ans1 = maxSubArray(arr);
		
		if(ans1 < 0)
		    return ans1;
		
		int ans2 = minSubArray(arr);
		return Math.max(ans1, ans2);
    }
}