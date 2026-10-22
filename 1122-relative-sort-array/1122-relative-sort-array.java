class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] ans = new int[arr1.length];
        int k = 0;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int x : arr1){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }


        for(int x : arr2) {
            if(mp.containsKey(x)) {
                int frequency = mp.get(x);
                for (int i = 0; i < frequency; i++) {
                    ans[k] = x;
                    k++;
                }
                mp.remove(x);
            }
        }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(mp);

        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int x = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                ans[k] = x;
                k++;
            }
        }

        return ans;
    }
}