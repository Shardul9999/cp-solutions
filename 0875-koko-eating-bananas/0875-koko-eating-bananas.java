class Solution {
    public long fun(int[] piles, int speed){
        long timetaken = 0;
        for(int i=0; i<piles.length; i++){
            timetaken += (piles[i] / speed);
            if(piles[i] % speed != 0) timetaken++;
        }
        return timetaken;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int result = -1;

        for(int i=0; i<piles.length; i++){
            high = Math.max(high, piles[i]);
            low = Math.min(low, piles[i]);
        }

        while(low <= high){
            int mid = low + (high-low) / 2;
            long ans = fun(piles,mid);

            if(ans <= h){
                result = mid;
                high = mid - 1;
            }
            else if(ans > h){
                low = mid + 1;
            }
        }

        return result;
    }
}