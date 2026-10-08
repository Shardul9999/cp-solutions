class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> mp1 = new HashMap<>();
        HashMap<String, Integer> mp2 = new HashMap<>();

        for(int i=0; i<list1.length; i++){
            mp1.put(list1[i],i);
        }
        for(int i=0; i<list2.length; i++){
            mp2.put(list2[i],i);
        }

        int min = Integer.MAX_VALUE;
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<list1.length; i++){
            if(mp2.containsKey(list1[i])){
                int sumIdx = mp1.get(list1[i]) + mp2.get(list1[i]);
                min = Math.min(min, sumIdx);
            }
        }

        for(int i=0; i<list1.length; i++){
            if(mp2.containsKey(list1[i])){
                if(mp1.get(list1[i]) + mp2.get(list1[i]) == min){
                    ans.add(list1[i]);
                }
            }
        }

        return ans.toArray(new String[0]);

    }
}