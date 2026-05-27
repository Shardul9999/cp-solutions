class Solution {
    public int main(int[] arr, int k){
        int low = 0;
        int result = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int high = 0; high < arr.length; high++){
            mp.put(arr[high], mp.getOrDefault(arr[high], 0) + 1);
            
            while(mp.size() > k){
                mp.put(arr[low], mp.get(arr[low]) - 1);
                
                if(mp.get(arr[low]) == 0){
                    mp.remove(arr[low]);
                }
                
                low++;
            }
            result += high-low+1;
        }
        return result;
    }
    public int subarraysWithKDistinct(int[] arr, int k) {
        return main(arr,k) - main(arr,k-1);
    }
}