class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String temp = new String(arr);

            if(!mp.containsKey(temp)){
                mp.put(temp, new ArrayList<>());
            }
            mp.get(temp).add(s);
        }

        List<List<String>> ans = new ArrayList<>(mp.values());
        
        return ans;
    }
}