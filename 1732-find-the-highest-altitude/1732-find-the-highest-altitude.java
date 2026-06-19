class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int maxAlti = 0;

        for(int i=0; i<gain.length; i++){
            sum += gain[i];
            maxAlti = Math.max(sum, maxAlti);
        }

        return maxAlti;
    }
}