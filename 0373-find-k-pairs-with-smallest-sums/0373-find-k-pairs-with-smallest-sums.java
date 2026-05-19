class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0],b[0])
        );

        for(int i=0; i<nums1.length; i++){
            pq.offer(new int[]{
                nums1[i] + nums2[0],
                i,
                0
            });
        }

        List<List<Integer>> lis = new ArrayList<>();

        for(int x=0; x < k && !pq.isEmpty(); x++){
            int[] temp = pq.poll();
            int i = temp[1];
            int j = temp[2];
            lis.add(Arrays.asList(nums1[i],nums2[j]));

            if(j+1 < nums2.length){
                pq.offer(new int[]{
                    nums1[i] + nums2[j+1],
                    i,
                    j+1
                });
            }
        }

        return lis;
    }
}