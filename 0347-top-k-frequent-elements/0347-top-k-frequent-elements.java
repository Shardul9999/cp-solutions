class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        int [] ans = new int[k];


        for(int ele : nums){
            mp.put(ele, mp.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.getValue(), a.getValue())
        );

        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            pq.offer(entry);
        }

        for(int i=0; i<k; i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}