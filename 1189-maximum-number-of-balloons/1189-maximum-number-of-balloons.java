class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int count = 0;

        for(char ch : text.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int b = mp.getOrDefault('b', 0);
        int a = mp.getOrDefault('a', 0);
        int l = mp.getOrDefault('l', 0) / 2; 
        int o = mp.getOrDefault('o', 0) / 2; 
        int n = mp.getOrDefault('n', 0);

        while (mp.getOrDefault('b', 0) >= 1 && 
               mp.getOrDefault('a', 0) >= 1 && 
               mp.getOrDefault('l', 0) >= 2 && 
               mp.getOrDefault('o', 0) >= 2 && 
               mp.getOrDefault('n', 0) >= 1) {
            
            count++;
            mp.put('b', mp.get('b') - 1);
            mp.put('a', mp.get('a') - 1);
            mp.put('l', mp.get('l') - 2);
            mp.put('o', mp.get('o') - 2); 
            mp.put('n', mp.get('n') - 1);
        }   

        return count;
    }
}