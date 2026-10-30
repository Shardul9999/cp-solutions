class Solution {
    public int countDays(int days, int[][] meetings) {
       Arrays.sort(meetings, (a,b) -> a[0]- b[0]);
       int buzydays = 0;
       int start = meetings[0][0];
       int end = meetings[0][1];

       for(int [] arr : meetings){
            if(arr[0] > end){
                buzydays += end - start + 1;
                start = arr[0];
                end = arr[1];
            }   
            else{
                end = Math.max(end, arr[1]);
            }
       }

       buzydays += end - start + 1;

       return days - buzydays;
    }
}