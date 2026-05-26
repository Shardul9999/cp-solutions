class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int low = 0;
        int high = 0;
        int index = 0;

        while(high < nums.length){
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[high]){
                dq.pollLast();
            }

            dq.offer(high);

            if(dq.peekFirst() < low){
                dq.pollFirst();
            }

            if(high - low + 1 == k){
                ans[index++] = nums[dq.peekFirst()];
                low++;
            }

            high++;
        }

        return ans;

        
    }
}