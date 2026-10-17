class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (int x : map.keySet()) {
            if (k == 0) {
                if (map.get(x) >= 2) {
                    count++;
                }
            } 
            else { 
                if (map.containsKey(x + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}