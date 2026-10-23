class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        List<Integer> lis = new ArrayList<>();

        for(int x : barcodes){
            mp.put(x, mp.getOrDefault(x,0) + 1);
        }

        int maxfreqcode = 0;
        int maxfreq = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() > maxfreq){
                maxfreq = entry.getValue();
                maxfreqcode = entry.getKey();
            }
        }

        int [] ans = new int[barcodes.length];
        int index = 0;

        while(maxfreq > 0){
            ans[index] = maxfreqcode;
            index += 2;
            maxfreq--;
        }
        mp.remove(maxfreqcode);

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int code = entry.getKey();
            int count = entry.getValue();

            while(count > 0){
                if(index >= ans.length) index = 1;
                ans[index] = code;
                index += 2;
                count--;
            }
           
        }
        
        return ans;
    }
}