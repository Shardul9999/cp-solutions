class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        for(char ch : order.toCharArray()) {
            if (mp.containsKey(ch)) {
                int frequency = mp.get(ch);
                for (int i = 0; i < frequency; i++) {
                    ans.append(ch);
                }
                mp.remove(ch);
            }
        }

        for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}