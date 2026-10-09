class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        HashMap<Integer,Integer> last = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            first.putIfAbsent(nums[i],i);
            last.put(nums[i],i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        int degree = Collections.max(count.values());

        int minlen = Integer.MAX_VALUE;
        for(int i : count.keySet()){
            if(count.get(i) == degree){
                minlen = Math.min(last.get(i) - first.get(i) + 1, minlen);
            }
        }
        return minlen;
    }
}