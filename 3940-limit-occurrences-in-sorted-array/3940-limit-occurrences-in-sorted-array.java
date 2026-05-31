class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> lis = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int freq = mp.getOrDefault(nums[i], 0);
            if(freq < k){
                lis.add(nums[i]);
                mp.put(nums[i], freq + 1);
            }
        }

        int [] arr = new int[lis.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = lis.get(i);
        }

        return arr;
    }
}