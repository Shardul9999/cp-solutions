class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int a : hand){
            mp.put(a, mp.getOrDefault(a, 0) + 1);
        }

        while(!mp.isEmpty()){
            int start = mp.firstKey();

            int count = mp.get(start);

            for(int i=0; i<groupSize; i++){
                int group = start + i;

                if(!mp.containsKey(group) || mp.get(group) < count) return false;

                if(mp.get(group) == count){
                    mp.remove(group);
                }
                else{
                    mp.put(group, mp.get(group)-count);
                }
            }
        }
        return true;
    }
}