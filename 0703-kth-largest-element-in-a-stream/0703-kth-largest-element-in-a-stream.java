class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] arr) {
        this.pq = new PriorityQueue<>();
        this.k = k;

        for(int i=0; i<arr.length; i++){
            pq.offer(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
    }

    public int add(int val) {
        pq.offer(val);
        if(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */