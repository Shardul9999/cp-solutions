class Solution {
    public int maxProduct(int[] arr) {
        int minending = arr[0];
        int maxending = arr[0];
        int ans = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int v1 = arr[i];
            int v2 = minending * arr[i];
            int v3 = maxending * arr[i];
            
            maxending = Math.max(v1, Math.max(v2,v3));
            minending = Math.min(v1, Math.min(v2,v3));
            
            ans = Math.max(ans, Math.max(maxending,minending));
        }
        return ans;
    }
}