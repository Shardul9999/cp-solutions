class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int index = 0;

        for(int i=0; i<nums.length; i++){
            int freq = mp.getOrDefault(nums[i], 0);

            if(freq < 2){
                mp.put(nums[i], freq+1);
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}