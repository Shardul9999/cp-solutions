class Solution {
    public int minOperations(int[] nums) {
        int flips = 0;
        for(int i=0; i<=nums.length-3; i++){
            if(nums[i] == 0){
                int j = i;
                while(j < i + 3){
                    if(nums[j] == 0){
                        nums[j] = 1;
                    }
                    else{
                        nums[j] = 0;
                    }  
                    j++;
                }
                flips++;
            }
            
        }

        for(int i = 0; i < nums.length; i++){
           if (nums[i] == 0) return -1;
        } 

        return flips;
    }
}