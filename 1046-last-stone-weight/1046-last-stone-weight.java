class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

        for(int i=0; i<stones.length; i++){
            pq.offer(stones[i]);
        }

        while(pq.size() > 1){
            int x = pq.poll();
            int y = pq.poll();
            pq.offer(x-y);
        }

        return pq.poll();
    }
}