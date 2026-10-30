class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> ans = new ArrayList<>();

        for(int[] arr : intervals){
            if(arr[0] <= end){
                end = Math.max(end,arr[1]);
            }
            else{
                ans.add(new int[]{start,end});
                start = arr[0];
                end = arr[1];
            }
        }
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}