class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long min1 = Integer.MAX_VALUE;
        long min2 = Integer.MAX_VALUE;
        long min3 = Integer.MAX_VALUE;

        min1 = (long)need1*cost1 + (long)need2*cost2;

        long common = Math.min(need1, need2);
        min2 = common*costBoth + ((need1 - common) * (long)cost1) + ((need2 - common) * (long)cost2);

        min3 = (long) Math.max(need1, need2) * costBoth;

        return Math.min((Math.min(min1, min2)), min3);
    }
}