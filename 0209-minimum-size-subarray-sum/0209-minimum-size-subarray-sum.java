class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int low = 0;
        int high = 0;

        while(high < arr.length){
            sum += arr[high];
                while(sum >= target){
                    minLen = Math.min(minLen, high-low+1);
                    sum -= arr[low];
                    low++;
                }
            high++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}