class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int x : time){
            count += mp.getOrDefault((60 - x % 60) % 60, 0);
            mp.put(x % 60, mp.getOrDefault(x % 60, 0) + 1);
        }   
        return count;
    }
}